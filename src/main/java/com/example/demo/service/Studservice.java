package com.example.demo.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studentity;
@Service
public class Studservice implements Studentservice {
    Map<Integer,Studentity> details=new HashMap<>();
    public Studentity saveData(Studentity st){
        details.put(st.getId(),st);
        return st;
    }
        @Override
    public Studentity insertStudent(Studentity st) {
        details.put(st.getId(),st);
        return st;
    }
    @Override
    public List<Studentity> getAllStudents() {
        return new ArrayList<>(details.values());
    }

    @Override
    public Optional<Studentity> getOneStudent(int id) {
        return Optional.ofNullable(details.get(id));
    }
   @Override
   public void deleteStudent(int id) {
    details.remove(id);
}
}