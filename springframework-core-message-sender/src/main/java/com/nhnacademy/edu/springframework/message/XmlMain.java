package com.nhnacademy.edu.springframework.message;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

            MessageSender smsMessageSender1 = context.getBean("smsMessageSender", MessageSender.class);
            MessageSender emailMessageSender1 = context.getBean("emailMessageSender", MessageSender.class);

            User user = new User("kim@nhnacademy.com", "010-XXXX-XXXX");
//            MessageSendService messageSendService1 = new MessageSendService(smsMessageSender);
//            messageSendService1.doSendMessage(user, "hello");

//            MessageSendService messageSendService2 = new MessageSendService(emailMessageSender);
//            messageSendService2.doSendMessage(user, "hello");
        }
    }
}