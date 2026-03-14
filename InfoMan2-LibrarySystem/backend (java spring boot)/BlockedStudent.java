package com.neulibrarysystem.librarysystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blocked_students")
public class BlockedStudent {

    @Id
    private String studentId; // The ID of the student who is blocked

    // Default Constructor
    public BlockedStudent() {}

    // Constructor with parameter
    public BlockedStudent(String studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}