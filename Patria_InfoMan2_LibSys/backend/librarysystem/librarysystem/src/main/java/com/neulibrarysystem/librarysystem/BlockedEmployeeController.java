package com.neulibrarysystem.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = {
        "http://unilibsysjlp05.infinityfreeapp.com",
        "https://unilibsysjlp05.infinityfreeapp.com",
        "http://localhost:5500",
        "http://localhost:8080"
})
public class BlockedEmployeeController {

    @Autowired
    private BlockedEmployeeRepository blockedEmployeeRepository;

    @PostMapping("/{employeeId}/block")
    public ResponseEntity<?> blockEmployee(@PathVariable String employeeId) {
        try {
            BlockedEmployee blockedEmployee = new BlockedEmployee(employeeId);
            blockedEmployeeRepository.save(blockedEmployee);

            return ResponseEntity.ok(Map.of("message", "Employee " + employeeId + " has been blocked successfully."));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error", "An error occurred while blocking the employee."));
        }
    }
}