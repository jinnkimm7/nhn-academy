package com.nhnacademy.edu.springframework.message;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework.message")
public class MainConfig {
    @Bean(name = "smsMessageSender")
    @Scope("prototype")
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean(name = "emailMessageSender")
    @Scope("singleton")
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }

    @Bean(name = "messageSendService")
    public MessageSendService messageSendService() {
        return new MessageSendService(emailMessageSender());
    }
}