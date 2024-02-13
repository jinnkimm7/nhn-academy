package com.nhnacademy.edu.springframework.message;

import org.springframework.beans.factory.InitializingBean;

public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(message + " from " + user.getEmail());
    }

    public void init() {
        System.out.println("EmailMessageSender initialized!!");
    }

    public void cleanup() {
        System.out.println("EmailMessageSender cleanup called!!");
    }
}
