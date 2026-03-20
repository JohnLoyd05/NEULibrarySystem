package com.neulibrarysystem.librarysystem;

import jakarta.persistence.*;

@Entity
@Table(name = "admin_logs")
public class AdminLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String loginDate;
    private String loginTime;

    public AdminLog() {}

    public AdminLog(String name, String email, String loginDate, String loginTime) {
        this.name = name;
        this.email = email;
        this.loginDate = loginDate;
        this.loginTime = loginTime;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLoginDate() { return loginDate; }
    public void setLoginDate(String loginDate) { this.loginDate = loginDate; }

    public String getLoginTime() { return loginTime; }
    public void setLoginTime(String loginTime) { this.loginTime = loginTime; }
}
