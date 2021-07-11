package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepo;

    @Autowired
    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

//    public List<Student> getStudents(){
//        List<Student> myList=  new ArrayList<>();
//        myList.add(new Student(
//                1L,
//                "Khaled Muhamed",
//                "khaled.m.abelghany@gmail.com",
//                LocalDate.of(1995,10,01),
//                26
//        ));
//        return myList;
//    }
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}
