package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/employee-visits")
@CrossOrigin(origins = "*")
public class EmployeeVisitController {

    @Autowired
    private EmployeeVisitRepository repository; // Ensure you have created this Repository!

    @PostMapping
    public ResponseEntity<?> saveVisit(@RequestBody EmployeeVisit visit) {
        // Set date and time just like the student form
        visit.setVisitDate(LocalDate.now());
        visit.setVisitTime(LocalTime.now());

        repository.save(visit);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<EmployeeVisit> getAllVisits() {
        return repository.findAll();
    }
}
