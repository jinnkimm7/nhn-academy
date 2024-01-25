package com.nhnacademy.student.servlet;

import com.nhnacademy.student.domain.Gender;
import com.nhnacademy.student.domain.Student;
import com.nhnacademy.student.repository.MapStudentRepository;
import com.nhnacademy.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@Slf4j
@WebServlet(name = "studentUpdateServlet", urlPatterns = "/student/update")
public class StudentUpdateServlet extends HttpServlet {
    private StudentRepository studentRepository = MapStudentRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        if (id == null || id.isEmpty()) {
            log.error("없는 아이디입니다.");
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "없는 아이디입니다.");
            return;
        }

        try {
            Student student = studentRepository.getStudentById(id);

            req.setAttribute("student", student);
            req.setAttribute("action", "/student/update");

            String viewPath = "/WEB-INF/views/student/register.jsp";
            RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
            dispatcher.forward(req, resp);
        } catch (NumberFormatException e) {
            log.error("유효하지 않은 아이디입니다.: {}", id);
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "유효하지 않은 아이디입니다.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String genderStr = req.getParameter("gender");
        int age = Integer.parseInt(req.getParameter("age"));

        if (id == null || id.isEmpty()) {
            log.error("없는 아이디입니다.");
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "없는 아이디입니다.");
            return;
        }

        try {
            Gender gender = genderStr.equals("M") ? Gender.M : Gender.F;

            Student existingStudent = studentRepository.getStudentById(id);
            existingStudent.setName(name);
            existingStudent.setGender(gender);
            existingStudent.setAge(age);
            existingStudent.setCreateAt(LocalDateTime.now());

            resp.sendRedirect("/student/view?id=" + id);
        } catch (NumberFormatException e) {
            log.error("유효하지 않은 아이디입니다.: {}", id);
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "유효하지 않은 아이디입니다.");
        }
    }
}