package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Studentity;
import com.example.demo.service.Studentservice;
import com.example.demo.service.Studservice;
@RestController
public class Studctl {
    @Autowired
    Studservice ser;
    @Autowired
    Studentservice service;
    @PostMapping("/add")    
    public Studentity post(@RequestBody Studentity st){
        return ser.saveData(st);
    }
    @GetMapping("/getAll")
    public List<Studentity> getAll(){
        return service.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Optional<Studentity> get(@PathVariable int id){
        return service.getOneStudent(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable int id , @RequestBody Studentity newStudent){
        Optional<Studentity> student = service.getOneStudent(id);
        if(student.isPresent()){
            newStudent.setId(id);
            service.insertStudent(newStudent);
            return "Updated successfully";
        }
        return "Id not found";
    }
    @DeleteMapping("/del/{id}")
    public String deleteStudent (@PathVariable int id){
        Optional <Studentity> student = service.getOneStudent(id);
        if(student.isPresent()){
            service.deleteStudent(id);
            return "Deleted successfully";
        }
        return "Id not found";
    }
}