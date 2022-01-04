package com.example.springbootmongodb.example.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collation = "students")
public class Student {

    @Id
    private int id;
    private long mobNo;
    private String name;
    private String city;
    private String college;


}
