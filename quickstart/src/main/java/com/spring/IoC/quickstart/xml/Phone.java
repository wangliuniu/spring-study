package com.spring.IoC.quickstart.xml;

/**
 * Created by ASUS on 2019/2/25.
 */
public class Phone {
    private String brand;
    private int price;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;

    }
}
