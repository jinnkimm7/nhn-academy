package com.nhnacademy.edu.springframework.project.repository;

import com.nhnacademy.edu.springframework.project.service.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


public class CsvStudents implements Students {
    public static CsvStudents instance;
    private List<Student> studentList;
    private CsvStudents() {
        this.studentList = new ArrayList<>();
    }

    /** TODO 3 :
     * Java Singleton 패턴으로 getInstance() 를 구현하세요.
     **/
    public static Students getInstance() {
        if (instance == null) {
            instance = new CsvStudents();
        }
        return instance;
    }

    // TODO 7 : student.csv 파일에서 데이터를 읽어 클래스 멤버 변수에 추가하는 로직을 구현하세요.
    // 데이터를 적재하고 읽기 위해서, 적절한 자료구조를 사용하세요.
    @Override
    public void load() {
        String filePath = "/Users/jin/Study/nhn-academy/springframework-project1/src/test/resources/data/student.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int studentSeq = Integer.parseInt(data[0].trim());
                String studentName = data[1].trim();

                Student student = new Student(studentSeq, studentName);
                studentList.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<Student> findAll() {
        return studentList;
    }

    /**
     * TODO 8 : students 데이터에 score 정보를 추가하세요.
     * @param scores
     */
    @Override
    public void merge(Collection<Score> scores) {
        for (Score score : scores) {
            int studentSeq = score.getStudentSeq();

            Optional<Student> matchingStudent = studentList.stream()
                    .filter(student -> student.getSeq() == studentSeq)
                    .findAny();

            matchingStudent.ifPresent(student -> student.setScore(score));
        }
    }
}
