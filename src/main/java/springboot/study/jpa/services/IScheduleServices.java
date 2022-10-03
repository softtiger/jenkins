package springboot.study.jpa.services;

import springboot.study.jpa.domain.Schedule;

/*
 * @author     chengYu
 * @date     2022/8/18
 * @describe
 */
public interface IScheduleServices {

    public Schedule addSchedule(Schedule schedule,Integer filmId);


    public void  removeSchedule(Integer scheduleId);

}
