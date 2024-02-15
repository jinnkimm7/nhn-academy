package com.nhnacademy.edu.springframework.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
    @Bean(name = "smsMessageSender", initMethod = "init", destroyMethod = "cleanup")
    @Scope("prototype")
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean(name = "emailMessageSender", initMethod = "init", destroyMethod = "cleanup")
    @Scope("singleton")
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }

    @Bean
    public MessageSendService messageSendService() {
        return new MessageSendService(smsMessageSender());
    }
}