package com.nhnacademy.student.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {
    private Long id;
    private String name;
    private Gender gender;
    private int age;
    private LocalDateTime createAt;

    public Student(String name, Gender gender, int age, LocalDateTime createAt) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.createAt = createAt;
    }
}
