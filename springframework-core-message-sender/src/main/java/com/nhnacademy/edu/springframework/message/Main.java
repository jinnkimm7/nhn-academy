package com.nhnacademy.edu.springframework.message;

public class Main {
    public static void main(String[] args) {
        User user = new User("hello@nhnacademy.com", "010-XXXX-XXXX");

        new MessageSendService(new EmailMessageSender()).doSendMessage(user, "안녕");
        new MessageSendService(new SmsMessageSender()).doSendMessage(user, "안녕");
    }
}