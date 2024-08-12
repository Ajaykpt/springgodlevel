package com.axios.axios.controller;

import com.axios.axios.model.Student;
import com.axios.axios.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api") // Added base path for consistency
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> displayAllStudents() {
        return studentService.displayAllStudents();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student stud) {
        return studentService.addStudent(stud);
    }
}
