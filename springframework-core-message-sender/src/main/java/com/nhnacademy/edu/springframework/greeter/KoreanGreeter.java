package com.nhnacademy.edu.springframework.greeter;

public class KoreanGreeter implements Greeter{
    @Override
    public boolean sayHello() {
        System.out.println("안녕");
        return true;
    }
}
