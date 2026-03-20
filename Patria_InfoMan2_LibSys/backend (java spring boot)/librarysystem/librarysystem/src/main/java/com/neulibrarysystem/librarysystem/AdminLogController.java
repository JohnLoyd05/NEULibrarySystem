package com.neulibrarysystem.librarysystem;


import com.neulibrarysystem.librarysystem.AdminLog;
import com.neulibrarysystem.librarysystem.AdminLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin-logs")
@CrossOrigin(origins = "*") // Allows your frontend to talk to this backend
public class AdminLogController {

    @Autowired
    private AdminLogRepository adminLogRepository;

    // Endpoint to save a new log
    @PostMapping
    public ResponseEntity<AdminLog> createLog(@RequestBody AdminLog log) {
        AdminLog savedLog = adminLogRepository.save(log);
        return ResponseEntity.ok(savedLog);
    }

    // Endpoint to retrieve all logs (You will use this for adminlogs.html later!)
    @GetMapping
    public List<AdminLog> getAllLogs() {
        return adminLogRepository.findAll();
    }
}
