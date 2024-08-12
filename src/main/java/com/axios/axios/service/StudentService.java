package com.axios.axios.service;

import com.axios.axios.model.Student;
import com.axios.axios.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> displayAllStudents() {
        return repo.findAll();
    }

    public Student addStudent(Student stud) {
        return repo.save(stud);
    }
}
