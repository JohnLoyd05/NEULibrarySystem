package com.neulibrarysystem.librarysystem;


import com.neulibrarysystem.librarysystem.AdminLog;
import com.neulibrarysystem.librarysystem.AdminLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin-logs")
@CrossOrigin(origins = "*")
public class AdminLogController {

    @Autowired
    private AdminLogRepository adminLogRepository;

    @PostMapping
    public ResponseEntity<AdminLog> createLog(@RequestBody AdminLog log) {
        AdminLog savedLog = adminLogRepository.save(log);
        return ResponseEntity.ok(savedLog);
    }

    @GetMapping
    public List<AdminLog> getAllLogs() {
        return adminLogRepository.findAll();
    }
}
