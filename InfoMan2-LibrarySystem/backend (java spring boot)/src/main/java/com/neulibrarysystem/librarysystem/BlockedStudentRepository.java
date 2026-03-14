package com.neulibrarysystem.librarysystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockedStudentRepository extends JpaRepository<BlockedStudent, String> {
    // Spring Boot automatically provides the save(), findAll(), and existsById() methods for us!
}