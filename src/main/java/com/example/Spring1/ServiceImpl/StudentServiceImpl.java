package com.example.Spring1.ServiceImpl;

import com.example.Spring1.DTO.Student;
import com.example.Spring1.Entity.StudentDetails;
import com.example.Spring1.Mapper.StudentMapper;
import com.example.Spring1.Repository.StudentRepo;
import com.example.Spring1.Service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createStudent(Student student) {
        log.info("Add Student");
        StudentDetails studentDetails = StudentMapper.INSTANCE.toEntity(student);
        studentDetails = studentRepo.save(studentDetails);
        return StudentMapper.INSTANCE.toDTO(studentDetails);
    }

    @Override
    public List<Student> getAllStudents() {
        List<StudentDetails> studentDetailsList = studentRepo.findAll();
        return studentDetailsList.stream()
                .map(StudentMapper.INSTANCE::toDTO)
                .toList();
    }

    @Override
    public Student updateStudent(String id, Student student) {
        Optional<StudentDetails> existingStudent = studentRepo.findById(id);
        if (existingStudent.isPresent()) {
            StudentDetails studentDetails = StudentMapper.INSTANCE.toEntity(student);
            studentDetails.setId(id);
            studentDetails = studentRepo.save(studentDetails);
            return StudentMapper.INSTANCE.toDTO(studentDetails);
        }
        return null;
    }

    @Override
    public boolean deleteStudent(String id) {
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepo.findById(id)
                .map(StudentMapper.INSTANCE::toDTO)
                .orElse(null);
    }
}
