package com.example.demo.service;


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
       
} 