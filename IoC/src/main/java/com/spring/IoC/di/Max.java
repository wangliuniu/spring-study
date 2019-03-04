package com.spring.IoC.di;

/**
 * Created by ASUS on 2019/3/4.
 * 待测程序，求两个数的最大值
 * 2.19.3.4
 */
public class Max {
    private  int a;
    private  int b;

    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getMax(){
        return a>b?a:b;
    }
}
