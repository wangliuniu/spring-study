package com.spring.IoC.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2019/2/25.
 */
public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("/beans.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPhone());

    }
}
