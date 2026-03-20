package com.neulibrarysystem.librarysystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blocked_employees")
public class BlockedEmployee {

    @Id
    private String employeeId;

    public BlockedEmployee() {}

    public BlockedEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}