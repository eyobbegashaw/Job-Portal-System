package com.jobportal.models;

import java.io.Serializable;
import java.util.List;

public class ApplicationForm implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String companyName;
    public String jobTitle;
    public List<String> fields;
    
    public ApplicationForm(String companyName, String jobTitle, List<String> fields) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.fields = fields;
    }
    
    // Getters and setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    
    public List<String> getFields() { return fields; }
    public void setFields(List<String> fields) { this.fields = fields; }
}