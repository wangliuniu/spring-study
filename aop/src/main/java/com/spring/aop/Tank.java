package com.spring.aop;

/**
 * Created by ASUS on 2019/3/7.
 */
public class Tank implements Move{
    @Override
    public void move() {
        System.out.println("tank is moving。。。");
    }
}
