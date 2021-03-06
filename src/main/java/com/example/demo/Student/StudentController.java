package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Student> getStudents() {
        return studentSer.getStudents();
    }

    @PostMapping
    public void addNewStudent(@RequestBody Student student){
        studentSer.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") long studentId){
        studentSer.deleteStudentById(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        studentSer.updateStudent(studentId,name,email);
    }
}
