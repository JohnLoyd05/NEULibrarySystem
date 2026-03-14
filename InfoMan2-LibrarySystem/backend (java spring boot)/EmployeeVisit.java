package com.neulibrarysystem.librarysystem;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "employee_visits")
public class EmployeeVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    // Named to match the JSON "fullName" from eForm.html
    private String fullName;

    // Named to match the JSON "employeeId" from eForm.html
    private String employeeId;

    private String department;
    private String role;
    private String purpose;

    private LocalDate visitDate;
    private LocalTime visitTime;

    // Default Constructor
    public EmployeeVisit() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public LocalDate getVisitDate() { return visitDate; }
    public void setVisitDate(LocalDate visitDate) { this.visitDate = visitDate; }

    public LocalTime getVisitTime() { return visitTime; }
    public void setVisitTime(LocalTime visitTime) { this.visitTime = visitTime; }
}