package.com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRepository;
import.com.example.demo.service.StudentService;


@service
public class StudentServiceImpl implements StudentService {
    @Autowired
    @StudentRepository
    @Override
    public Student poststudent(Student st){
        return
    }

}