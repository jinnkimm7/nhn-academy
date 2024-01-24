package com.nhnacademy.student.repository;

import com.nhnacademy.student.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapStudentRepository implements StudentRepository {
    private Map<Long, Student> store = new ConcurrentHashMap<>();
    private Long sequence = 0L;
    private static final MapStudentRepository instance = new MapStudentRepository();

    private MapStudentRepository() {} // 추가적인 객체를 생성할 수 없도록 함.
    public static MapStudentRepository getInstance() {
        return instance;
    }

    @Override
    public Student save(Student student) {
        student.setId(++sequence);
        store.put(student.getId(), student);
        return student;
    }

    @Override
    public void update(Student student) {
        Long studentId = student.getId();
        if (store.containsKey(studentId)) {
            store.put(studentId, student);
        }
    }

    @Override
    public void deleteById(String id) {
        store.remove(Long.parseLong(id));
    }

    @Override
    public Student getStudentById(String id) {
        return store.get(Long.parseLong(id));
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(store.values());
    }

    @Override
    public boolean existById(Long id) {
        return store.containsKey(id);
    }
}