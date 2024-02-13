package com.nhnacademy.edu.springframework.greeter;

public class EnglishGreeter implements Greeter{
    @Override
    public boolean sayHello() {
        System.out.println("Hello!");
        return true;
    }
}
