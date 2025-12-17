package com.example.demo.sevice;

import.java.util.List;
import.java.util.Optinal;

import com.example.demo.entity.StudentEntity;

public interface StudentService{
    StudentEntity insertStudent(StudentEntity st);
    List<StudentEntity>getAllStudent();
    Optinal<StudentEntity>getOneStudent(int id);
    void deleteStudent(int id);
}