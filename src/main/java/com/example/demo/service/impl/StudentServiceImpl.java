package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository stdrepo;

    public StudentServiceImpl(StudentRepository stdrepo) {
        this.stdrepo = stdrepo;
    }

    @Override
    public Student postStudent(Student st) {   
        return stdrepo.save(st);
    }

    @Override
    public List<Student> getAllStudents() {
        return stdrepo.findAll();
    }

    @Override
    public Optional<Student> getById(Long id) {
        return stdrepo.findById(id);
    }
    @Override
    public String updateData(Long id,Student st){
        boolean status=stdrepo.existById(id);
        if(status){
           st.setId(id);
           stdrepo.save(st);
           return "Student Updated Successfully";
        }
        else{
            return "Student with ID",id
        }
    }
}
