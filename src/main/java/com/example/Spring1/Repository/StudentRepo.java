package com.example.Spring1.Repository;

import com.example.Spring1.Entity.StudentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<StudentDetails, String> {
}
