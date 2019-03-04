package com.spring.quickstart.xml;

/**
 * Created by ASUS on 2019/2/25.
 */
public class Student {
    private String name;
    private int age;
    private Phone phone;

    public Student(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Student() {
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
