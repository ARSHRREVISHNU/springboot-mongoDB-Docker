package com.example.spingbootmongodbdemo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Student {



    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> subjects;
    private BigDecimal totalTimeSpentInBooks;
   // private ZonedDateTime created;

    public Student(String firstName, String lastName, String email, Gender gender, Address address, List<String> subjects, BigDecimal totalTimeSpentInBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.subjects = subjects;
        this.totalTimeSpentInBooks = totalTimeSpentInBooks;
     //   this.created = created;
    }
}
