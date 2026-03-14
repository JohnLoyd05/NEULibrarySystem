package com.neulibrarysystem.librarysystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryVisitRepository extends JpaRepository<LibraryVisit, Long> {
    // You don't need to write anything inside here!
    // JpaRepository already contains the save(), findAll(), and delete() methods.
}
