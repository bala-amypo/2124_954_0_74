package com.example.demo.service;

import java.util.*;
import org.springframeworks.
import com.example.demo.service.StudentService;
public class StudSer implementation StudentService{
       Map<Integer,StudentEntity> details=new HashMap<>();
       public StudentEntity saveData(StudentEntity st){
        details.put(st.getId(),st);
        return st;
       }
       @Override
       public StudentEntity insertStudent(StudentEntity st){
        details.put(st.getId(),st);
        return st;
       }
       @Override
       public List<StudentEntity>getAllStudent(){
        return new ArrayList<>(details.value());
       }
       @Override
       public Optinal<StudentEntity>getOneStudent(){
        return Optinal.ofNullable(details.get(id));
       }
       @Override
       public void deleteStudent(int id){
        details.remove(id);
       }
} 