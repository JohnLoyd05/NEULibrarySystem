package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*") // Allows your HTML dashboard to connect without CORS errors
public class BlockedStudentController {

    @Autowired
    private BlockedStudentRepository blockedStudentRepository;

    // This URL matches the fetch URL in your sdashboard.html perfectly
    @PostMapping("/{studentId}/block")
    public ResponseEntity<?> blockStudent(@PathVariable String studentId) {
        try {
            // Create a new BlockedStudent record and save it to the database
            BlockedStudent blockedStudent = new BlockedStudent(studentId);
            blockedStudentRepository.save(blockedStudent);

            // Return a success JSON message
            return ResponseEntity.ok(Map.of("message", "Student " + studentId + " has been blocked successfully."));
        } catch (Exception e) {
            e.printStackTrace();
            // Return a 500 Server Error if something goes wrong
            return ResponseEntity.status(500).body(Map.of("error", "An error occurred while blocking the student."));
        }
    }
}