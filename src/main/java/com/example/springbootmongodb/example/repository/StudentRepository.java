package com.example.springbootmongodb.example.repository;

import com.example.springbootmongodb.example.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
