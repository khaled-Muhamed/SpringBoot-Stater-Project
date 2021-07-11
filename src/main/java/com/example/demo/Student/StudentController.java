package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        List<Student> myList=  new ArrayList<>();
        myList.add(new Student(
                1L,
                "Khaled Muhamed",
                "khaled.m.abelghany@gmail.com",
                LocalDate.of(1995,10,01),
                26
        ));
        return myList;
    }
}
