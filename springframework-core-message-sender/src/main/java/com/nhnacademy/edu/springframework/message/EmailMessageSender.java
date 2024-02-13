package com.nhnacademy.edu.springframework.message;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(message + " from " + user.getEmail());
    }
}
