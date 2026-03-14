package com.neulibrarysystem.librarysystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockedEmployeeRepository extends JpaRepository<BlockedEmployee, String> {
    // Spring Boot automatically gives us the save() and existsById() methods
}