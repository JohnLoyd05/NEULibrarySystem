package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*") // Fixes CORS errors so your HTML can connect
public class BlockedEmployeeController {

    @Autowired
    private BlockedEmployeeRepository blockedEmployeeRepository;

    @PostMapping("/{employeeId}/block")
    public ResponseEntity<?> blockEmployee(@PathVariable String employeeId) {
        try {
            // Create a new BlockedEmployee record and save it to the database
            BlockedEmployee blockedEmployee = new BlockedEmployee(employeeId);
            blockedEmployeeRepository.save(blockedEmployee);

            // Return a success JSON message
            return ResponseEntity.ok(Map.of("message", "Employee " + employeeId + " has been blocked successfully."));
        } catch (Exception e) {
            e.printStackTrace();
            // Return a 500 Server Error if something goes wrong
            return ResponseEntity.status(500).body(Map.of("error", "An error occurred while blocking the employee."));
        }
    }
}