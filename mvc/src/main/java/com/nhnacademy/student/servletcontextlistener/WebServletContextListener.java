package com.nhnacademy.student.servletcontextlistener;

import com.nhnacademy.student.domain.Gender;
import com.nhnacademy.student.domain.Student;
import com.nhnacademy.student.repository.MapStudentRepository;
import com.nhnacademy.student.repository.StudentRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;
import java.util.Random;

@WebListener
public class WebServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        StudentRepository studentRepository = MapStudentRepository.getInstance();
        context.setAttribute("studentRepository", studentRepository);

        for (int i = 1; i <= 10; i++) {
            Gender gender = i % 2 == 0 ? Gender.M : Gender.F;
            Random rd = new Random();

            studentRepository.save(new Student("student" + i, gender, 20 + rd.nextInt(20), LocalDateTime.now()));
        }
    }
}
