package com.jobportal.models;

import javafx.scene.image.Image;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JobPosting implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String title, description, jobType, qualifications, skills, salaryRange, location, method;
    public String companyName;
    public transient Image companyLogo;
    public String logoFilePath;
    public int vacancies, experience;
    public LocalDate deadline;
    public LocalDateTime postedDate;
    public List<String> applicants = new ArrayList<>();
    
    public JobPosting(String title, String description, String jobType, int vacancies,
                     String qualifications, String skills, int experience,
                     String salaryRange, LocalDate deadline, String location,
                     String method, String companyName, Image companyLogo, String logoFilePath) {
        this.title = title;
        this.description = description;
        this.jobType = jobType;
        this.vacancies = vacancies;
        this.qualifications = qualifications;
        this.skills = skills;
        this.experience = experience;
        this.salaryRange = salaryRange;
        this.deadline = deadline;
        this.location = location;
        this.method = method;
        this.companyName = companyName;
        this.companyLogo = companyLogo;
        this.logoFilePath = logoFilePath;
        this.postedDate = LocalDateTime.now();
    }
    
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        // Handle image serialization if needed
    }
    
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        // Handle image deserialization if needed
    }
    
    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    
    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }
}