package com.spring.IoC.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2019/3/4.
 */
public class MeetingApp {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Meeting meeting=context.getBean(Meeting.class);
        System.out.println(meeting);

//        Car car =(Car) context.getBean("car1");
//        System.out.println(car);
//
//        Boss boss =(Boss)context.getBean("boss1");
//        System.out.println(boss);
//
//        Meeting meeting1=(Meeting)context.getBean("meeting");
//        System.out.println(meeting);

    }
}
