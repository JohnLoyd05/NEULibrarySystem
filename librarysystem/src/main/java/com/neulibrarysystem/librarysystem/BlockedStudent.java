package com.neulibrarysystem.librarysystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blocked_students")
public class BlockedStudent {

    @Id
    private String studentId;

    public BlockedStudent() {}

    public BlockedStudent(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}