package com.nhnacademy.edu.springframework.message;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(message + " from " + user.getPhoneNumber());
    }
}
