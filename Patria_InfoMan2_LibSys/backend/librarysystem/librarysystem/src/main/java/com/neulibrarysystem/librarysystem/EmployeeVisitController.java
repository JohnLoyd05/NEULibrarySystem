package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/employee-visits")
@CrossOrigin(origins = {
        "http://unilibsysjlp05.infinityfreeapp.com",
        "https://unilibsysjlp05.infinityfreeapp.com",
        "http://localhost:5500",
        "http://localhost:8080"
})
public class EmployeeVisitController {

    @Autowired
    private EmployeeVisitRepository repository;

    @PostMapping
    public ResponseEntity<?> saveVisit(@RequestBody EmployeeVisit visit) {
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
