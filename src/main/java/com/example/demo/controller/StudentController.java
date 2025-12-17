package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public StudentEntity add(@RequestBody StudentEntity st) {
        return service.insertStudent(st);
    }

    @GetMapping("/getAll")
    public List<StudentEntity> getAll() {
        return service.getAllStudent();
    }

    @GetMapping("/get/{id}")
    public Optional<StudentEntity> get(@PathVariable int id) {
        return service.getOneStudent(id);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody StudentEntity st) {
        if (service.getOneStudent(id).isPresent()) {
            st.setId(id);
            service.insertStudent(st);
            return "Updated Successfully";
        }
        return "ID not found";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteStudent(id);
        return "Deleted Successfully";
    }
}
