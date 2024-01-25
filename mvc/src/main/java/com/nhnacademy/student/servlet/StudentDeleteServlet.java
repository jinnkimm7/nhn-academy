package com.nhnacademy.student.servlet;

import com.nhnacademy.student.repository.MapStudentRepository;
import com.nhnacademy.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet(name = "studentDeleteServlet", urlPatterns = "/student/delete")
public class StudentDeleteServlet extends HttpServlet {
    private StudentRepository studentRepository = MapStudentRepository.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idParameter = req.getParameter("id");

        if (idParameter == null || idParameter.isEmpty()) {
            log.error("존재하지 않는 아이디입니다.");
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "존재하지 않는 아이디입니다.");
            return;
        }

        try {
            Long id = Long.parseLong(idParameter);
            studentRepository.deleteById(id);

            resp.sendRedirect("/student/list");
        } catch (NumberFormatException e) {
            log.error("유효하지 않는 아이디입니다. {}", idParameter);
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "유효하지 않는 아이디입니다.");
        }
    }
}
