package com.nhnacademy.edu.springframework.message;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        User user = new User("kim@nhnacademy", "010-XXXX-XXXX");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.message");
        MessageSendService messageSenderService = context.getBean("messageSendService", MessageSendService.class);
        messageSenderService.doSendMessage(user, "Hello");

        String dbms = context.getBean("dbms", String.class);
    }
}
