package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");

        // get the bea from spring cotainer
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theCoachF = context.getBean("footballCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoachF.getDailyWorkout());

        // close the context
        context.close();
    }
}
