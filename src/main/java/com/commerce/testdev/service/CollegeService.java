package com.commerce.testdev.service;

import com.commerce.testdev.Entity.Student;
import com.commerce.testdev.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

    @Autowired
    private StudentDAO studentDAO;

    public Student getStudent(int id) {
        return studentDAO.findById(id);
    }
}
