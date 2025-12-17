package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.StudentEntity;

public interface StudentService {

    StudentEntity insertStudent(StudentEntity st);

    List<StudentEntity> getAllStudent();

    Optional<StudentEntity> getOneStudent(int id);

    void deleteStudent(int id);
}
