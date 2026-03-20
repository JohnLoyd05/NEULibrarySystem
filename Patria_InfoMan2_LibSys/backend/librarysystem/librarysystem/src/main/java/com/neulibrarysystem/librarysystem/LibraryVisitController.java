package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/visits")
@CrossOrigin(origins = {
        "http://unilibsysjlp05.infinityfreeapp.com",
        "https://unilibsysjlp05.infinityfreeapp.com",
        "http://localhost:5500",
        "http://localhost:8080"
})
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