package com.nhnacademy.edu.springframework.message;

public class MessageSendService {
    private MessageSender messageSender;

//    public MessageSendService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }

    public MessageSendService() {}
    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("setMessageSender invoked!!");
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}