package com.jobportal.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String name, email, password, userType, status;
    public String companyName;
    public String profileImagePath;
    public List<String> savedJobs;
    
    public User(String name, String email, String password, String userType, 
                String companyName, String profileImagePath) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.companyName = companyName;
        this.profileImagePath = profileImagePath;
        this.savedJobs = new ArrayList<>();
        this.status = "Pending";
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}