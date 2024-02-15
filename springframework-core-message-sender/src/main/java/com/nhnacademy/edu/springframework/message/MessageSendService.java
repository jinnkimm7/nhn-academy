package com.nhnacademy.edu.springframework.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageSendService {
    // 같은 타입의 객체가 여러개 존재하는 경우, 배열이나 Collection 으로 의존성을 주입할 수 있습니다.
    private final MessageSender messageSenders;

//    스프링 프레임워크에서는 생성자 방식으로 의존성 주입하는 것을 권장합니다.
    @Autowired
    public MessageSendService(@Qualifier("emailMessageSender") MessageSender messageSenders) {
        this.messageSenders = messageSenders;
    }

//    setter 메소드가 없더라도 field에 직접 @Autowired를 설정하여 의존성을 주입할 수 있습니다.
//    public void setSmsMessageSender(MessageSender messageSender) {
//        System.out.println("setMessageSender invoked!!");
//        this.messageSender = messageSender;
//    }

    public void doSendMessage(User user, String message) {
        messageSenders.sendMessage(user,message);
    }
}