package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService stdser;

    public StudentController(StudentService stdser) {
        this.stdser = stdser;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return stdser.postStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return stdser.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return stdser.getById(id);
    }
}
