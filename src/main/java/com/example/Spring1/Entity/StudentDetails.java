package com.example.Spring1.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "studentDetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDetails {

    @Id
    private String id;

    private String name;
    private int age;
    private String fatherName;
    private String motherName;

}
