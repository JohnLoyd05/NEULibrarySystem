package com.neulibrarysystem.librarysystem;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class LibraryVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // This auto-generates a unique ID (1, 2, 3...)

    private String email;
    private String fullName;
    private String studentId;
    private String program;
    private String purpose;

    private LocalDate visitDate;
    private LocalTime visitTime;

    // --- GETTERS AND SETTERS ---
    // (Spring Boot needs these to read and write the data)

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public LocalDate getVisitDate() { return visitDate; }
    public void setVisitDate(LocalDate visitDate) { this.visitDate = visitDate; }

    public LocalTime getVisitTime() { return visitTime; }
    public void setVisitTime(LocalTime visitTime) { this.visitTime = visitTime; }
}