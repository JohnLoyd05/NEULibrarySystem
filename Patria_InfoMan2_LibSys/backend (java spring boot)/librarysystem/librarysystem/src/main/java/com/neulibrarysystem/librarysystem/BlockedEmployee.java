package com.neulibrarysystem.librarysystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blocked_employees")
public class BlockedEmployee {

    @Id
    private String employeeId; // The ID of the employee who is blocked

    // Default Constructor
    public BlockedEmployee() {}

    // Constructor with parameter
    public BlockedEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}