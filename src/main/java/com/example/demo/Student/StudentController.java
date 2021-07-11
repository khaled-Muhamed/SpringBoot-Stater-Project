package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private final StudentService studentSer;

    public StudentController(StudentService studentSer) {
        this.studentSer = studentSer;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentSer.getStudents();
    }
}
