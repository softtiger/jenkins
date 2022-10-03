package springboot.study.jpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.study.jpa.dao.FilmRepository;
import springboot.study.jpa.dao.ScheduleRepository;
import springboot.study.jpa.domain.Film;
import springboot.study.jpa.domain.Schedule;
import springboot.study.jpa.services.IScheduleServices;

import java.util.Optional;

/*
 * @author     chengYu
 * @date     2022/8/18
 * @describe
 */
@Service
public class ScheduleServicesImpl implements IScheduleServices {

    @Autowired
    FilmRepository  filmRepository;

    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public Schedule addSchedule(Schedule schedule, Integer filmId) {
        Optional<Film> optionalFilm = filmRepository.findById(filmId);
        if (optionalFilm.isPresent()){
             Film persistFilm = optionalFilm.get();
             schedule.setFilm(persistFilm);
             return scheduleRepository.save(schedule);

        }
        return null;
    }

    @Override
    public void removeSchedule(Integer scheduleId) {
            scheduleRepository.deleteById(scheduleId);
    }


}
