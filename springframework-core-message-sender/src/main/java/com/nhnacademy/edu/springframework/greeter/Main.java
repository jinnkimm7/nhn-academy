package com.nhnacademy.edu.springframework.greeter;

public class Main {
    public static void main(String[] args) {
        new GreetingService(new EnglishGreeter()).greet();
        new GreetingService(new KoreanGreeter()).greet();
    }
}