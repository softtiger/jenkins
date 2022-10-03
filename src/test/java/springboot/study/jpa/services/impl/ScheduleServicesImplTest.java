package springboot.study.jpa.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.study.jpa.domain.Schedule;
import springboot.study.jpa.services.IScheduleServices;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author     chengYu
 * @date     2022/8/18
 * @describe
 */
@SpringBootTest
class ScheduleServicesImplTest {

    @Autowired
    IScheduleServices scheduleServices;

    @Test
    void addSchedule() {
        Schedule schedule = new Schedule();
        schedule.setPrice(500);
        schedule.setQuota(90);
        schedule.setTheater("changJiang No 1.");
        schedule.setShowTime(new Date(System.currentTimeMillis()));
        scheduleServices.addSchedule(schedule,1);
    }

    @Test
    void removeSchedule() {
        scheduleServices.removeSchedule(2);
    }
}