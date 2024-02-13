package com.nhnacademy.edu.springframework.document;
    public class CsvApplication extends Application {
        @Override
        protected Document createDocument() {
            return new CsvDocument();
        }
    }
