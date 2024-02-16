package com.nhnacademy.edu.springframework.project.repository;

import com.nhnacademy.edu.springframework.project.service.Student;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {
    private Students students = CsvStudents.getInstance();
    private Scores scores = CsvScores.getInstance();
    @Test
    void loadAndMergeAndFindAll() {
        students.load();
        scores.load();

        Collection<Student> loadedStudents = students.findAll();

        students.merge(scores.findAll());

        assertEquals(4, loadedStudents.size());
        System.out.println(loadedStudents);
    }
}