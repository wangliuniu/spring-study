package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ASUS on 2019/3/7.
 * 用户自定义的前置增强类
 */

public class MyBeforeAdvice{
    private static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);

public void beforeMethod(){
    //定义前置方法
    logger.debug("This is a before method by maoyue");
    logger.info("This is a before method by 毛玥");
//    public void beforeMethod(){
//        System.out.println("This is a before method.");
//    }


//    public void connectDB(){
//    开始连接数据库
//            开始插入操作
}
        }