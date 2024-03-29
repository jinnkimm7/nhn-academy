package com.nhnacademy.edu.springframework.message;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(message + " from " + user.getEmail());
    }

    public void init() {
        System.out.println("EmailMessageSender initialized!! - singleton");
    }

    public void cleanup() {
        System.out.println("EmailMessageSender cleanup called!!");
    }
}
