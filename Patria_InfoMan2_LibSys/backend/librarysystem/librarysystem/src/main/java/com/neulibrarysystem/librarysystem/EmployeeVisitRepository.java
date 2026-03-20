package com.neulibrarysystem.librarysystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeVisitRepository extends JpaRepository<EmployeeVisit, Long> {
}
