package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public void addNewStudent(Student student) {
        Optional<Student> students = studentRepo.findStudentByEmail(student.getEmail());
        if(students.isPresent()){
            //student already exist
            throw new IllegalStateException("email is taken");
        }
        studentRepo.save(student);
    }

    public void deleteStudentById(long studentId) {
        if(!studentRepo.existsById(studentId)){
            //this id doesn't exist
            throw new IllegalStateException("student with id =" + studentId+" doesn't exists");
        }
        studentRepo.deleteById(studentId);
    }
    @Transactional
    public void updateStudent(long studentId, String name, String email) {
        //check if student exists else return throw exception
        Student student = studentRepo.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("user with id = "+studentId+" doesn't exist"));
        if( name != null &&
            name.length() != 0 &&
                !Objects.equals(name,student.getName())){
            student.setName(name);
        }

        if( email != null &&
                email.length() != 0 &&
                !Objects.equals(email,student.getEmail())){
            //we need to check if the email is already taken
            Optional<Student> students = studentRepo.findStudentByEmail(email);
            if(students.isPresent()){
                //student already exist
                throw new IllegalStateException("email is taken");
            }
                student.setEmail(email);
        }
    }
}
