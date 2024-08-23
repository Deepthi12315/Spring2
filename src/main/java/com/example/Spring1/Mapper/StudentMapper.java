package com.example.Spring1.Mapper;

import com.example.Spring1.DTO.Student;
import com.example.Spring1.Entity.StudentDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDetails toEntity(Student student);

    Student toDTO(StudentDetails studentDetails);
}
