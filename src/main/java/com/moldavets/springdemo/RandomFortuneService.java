package com.moldavets.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Earn some money",
            "Eat some food",
            "Write code"
    };

    @Override
    public String getFortune() {
        return data[new Random().nextInt(data.length)];
    }
}
