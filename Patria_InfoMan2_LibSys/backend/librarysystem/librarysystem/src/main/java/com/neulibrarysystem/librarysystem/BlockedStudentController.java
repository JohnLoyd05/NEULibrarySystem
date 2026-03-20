package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class BlockedStudentController {

    @Autowired
    private BlockedStudentRepository blockedStudentRepository;

    @PostMapping("/{studentId}/block")
    public ResponseEntity<?> blockStudent(@PathVariable String studentId) {
        try {
            BlockedStudent blockedStudent = new BlockedStudent(studentId);
            blockedStudentRepository.save(blockedStudent);

            return ResponseEntity.ok(Map.of("message", "Student " + studentId + " has been blocked successfully."));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error", "An error occurred while blocking the student."));
        }
    }
}