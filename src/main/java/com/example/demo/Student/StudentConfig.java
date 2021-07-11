package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepo){
        return args -> {
          Student mariam =  new Student(
                    "mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5),
                    21);

            Student alex =  new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,5),
                    21);
            List<Student> studentList = new ArrayList<>();
            studentList.add(mariam);studentList.add(alex);

            studentRepo.saveAll(studentList);
        };
    }
}
