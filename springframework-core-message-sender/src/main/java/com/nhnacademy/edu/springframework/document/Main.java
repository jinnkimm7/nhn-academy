package com.nhnacademy.edu.springframework.document;

public class Main {
    public static void main(String[] args) {
        Application csvApplication = new CsvApplication();
        csvApplication.openDocument();

//        Application jsonApplication = new JsonApplication();
//        jsonApplication.openDocument();
    }
}