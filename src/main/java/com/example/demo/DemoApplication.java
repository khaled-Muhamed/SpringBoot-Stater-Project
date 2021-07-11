package com.example.demo;

import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public List<Student> hello(){
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
