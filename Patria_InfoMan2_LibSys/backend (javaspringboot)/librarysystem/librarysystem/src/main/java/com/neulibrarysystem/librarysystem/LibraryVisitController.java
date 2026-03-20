package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/visits")
@CrossOrigin(origins = "*")
public class LibraryVisitController {

    @Autowired
    private LibraryVisitRepository repository;

    @PostMapping
    public LibraryVisit saveVisit(@RequestBody LibraryVisit visit) {
        visit.setVisitDate(LocalDate.now());
        visit.setVisitTime(LocalTime.now());

        return repository.save(visit);
    }

    @GetMapping
    public List<LibraryVisit> getAllVisits() {
        return repository.findAll();
    }
}