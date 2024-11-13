package com.moldavets.springdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside constructor");
//        this.fortuneService = fortuneService;
//    }

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Spent 30 min to tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doStartupStaff() {
        System.out.println("TennisCoach: inside method doStartupStaff");
    }

    @PreDestroy
    public void doCleanupStaff() {
        System.out.println("TennisCoach: inside method doCleanupStaff");
    }

//    public void setDailyFortune(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside setDailyFortune method");
//        this.fortuneService = fortuneService;
//    }
}
