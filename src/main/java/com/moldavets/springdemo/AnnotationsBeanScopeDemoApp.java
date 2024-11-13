package com.moldavets.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Is that same objects: " + theCoach.equals(alphaCoach));

        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);
        context.close();

    }

}
