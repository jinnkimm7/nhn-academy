package com.nhnacademy.edu.springframework.document;

public class CsvDocument extends Document {
    @Override
    public void open() {
        System.out.println("csvDocument opened");
    }
}