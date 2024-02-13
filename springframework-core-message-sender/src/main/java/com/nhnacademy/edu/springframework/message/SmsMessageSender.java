package com.nhnacademy.edu.springframework.message;

import org.springframework.beans.factory.InitializingBean;

public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(message + " from " + user.getPhoneNumber());
    }

    public void init() {
        System.out.println("SmsMessageSender initialized!!");
    }
    public void cleanup() {
        System.out.println("SmsMessageSender cleanup called!!");
    }
}
