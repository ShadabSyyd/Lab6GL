package com.greatLearning.studentManagement.service;

import com.greatLearning.studentManagement.Exception.StudentException;
import com.greatLearning.studentManagement.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    public List<Student> findAll();

    public Student findById(int theId) throws StudentException;

    public Student save(Student thestudent);

    public void deleteById(int theId);

}
