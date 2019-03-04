package com.spring.IoC.di;

/**
 * Created by ASUS on 2019/3/4.
 */
public class MessagePrinter {
    final private MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void pinterMessage(){
    System.out.println(this.service.getMessage());
}
}
