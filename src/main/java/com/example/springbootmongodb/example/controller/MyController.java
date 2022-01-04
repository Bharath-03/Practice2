package com.example.springbootmongodb.example.controller;


import com.example.springbootmongodb.example.models.Student;
import com.example.springbootmongodb.example.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {

    private StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent()
    {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
