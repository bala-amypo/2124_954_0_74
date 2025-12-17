package com.example.demo.controller;

import java.util.*;

import org.springframework.web.beans.factory.annotation.Autowired;
import org.springframework.web.beans.factory.annotation.DeletMapping;
import org.springframework.web.beans.factory.annotation.GetMapping;
import org.springframework.web.beans.factory.annotation.PathVariable;
import org.springframework.web.beans.factory.annotation.PostMapping;
import org.springframework.web.beans.factory.annotation.PutMapping;
import org.springframework.web.beans.factory.annotation.RequestBody;
import org.springframework.web.beans.factory.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudSer;

@RestController
public class StudentController{
    @Autowired
    StudSer ser;
    @Autowired
    StudentService service;
    @PostMapping("/add")
    public StudentEntity post(@RequestBody StudentEntity st){
        return ser.saveData(st);
    }
    @GetMapping("/getAll")
    public List<StudentEntity>getAll(){
        return service.getAllStudent();
    } 
    @GetMapping("/get/{id}")
    public Optinal<StudentEntity>get(@PathVariable int id){
        return service.getOneStudent(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable int id,@RequestBody StudentEntity newStudent){
        Optinal<StudentEntity> student=service.getOneStudent(id);
        if(student.isPresent()){
            
        }
    }
}
