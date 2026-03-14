package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/visits")
@CrossOrigin(origins = "*") // Crucial: This allows your HTML file to talk to your Java server!
public class LibraryVisitController {

    @Autowired
    private LibraryVisitRepository repository;

    // This method handles the incoming data from your HTML form
    @PostMapping
    public LibraryVisit saveVisit(@RequestBody LibraryVisit visit) {
        // Automatically set the exact server date and time of the visit
        visit.setVisitDate(LocalDate.now());
        visit.setVisitTime(LocalTime.now());

        // Save to MySQL and return the saved data
        return repository.save(visit);
    }

    // This method lets your Admin Dashboard grab all the logs later
    @GetMapping
    public List<LibraryVisit> getAllVisits() {
        return repository.findAll();
    }
}