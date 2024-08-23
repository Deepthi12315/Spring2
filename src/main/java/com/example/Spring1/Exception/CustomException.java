package com.example.Spring1.Exception;

class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
