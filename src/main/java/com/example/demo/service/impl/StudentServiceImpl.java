package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public StudentEntity insertStudent(StudentEntity st) {
        return repo.save(st);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return repo.findAll();
    }

    @Override
    public Optional<StudentEntity> getOneStudent(int id) {
        return repo.findById(id);
    }

    @Override
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
