package com.jobportal.models;

import java.io.Serializable;

public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String name, description, logoFilePath;
    
    public Company(String name, String description, String logoFilePath) {
        this.name = name;
        this.description = description;
        this.logoFilePath = logoFilePath;
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getLogoFilePath() { return logoFilePath; }
    public void setLogoFilePath(String logoFilePath) { this.logoFilePath = logoFilePath; }
}