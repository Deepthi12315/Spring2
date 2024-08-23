package com.example.Spring1.Service;

import com.example.Spring1.DTO.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(String id, Student student);

    boolean deleteStudent(String id);

    Student getStudentById(String id);
}
