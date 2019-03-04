package com.spring.IoC.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2019/2/25.
 */
public class HelloWorldApp {
    public static void main(String[] args) {
//     读入xml文件
        ApplicationContext context = new
                ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        helloWorld运行
        System.out.println(helloWorld.getHello());
    }
}
