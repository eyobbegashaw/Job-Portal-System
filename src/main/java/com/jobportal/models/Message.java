package com.jobportal.models;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String sender, recipient, companyName, jobTitle, content;
    public String logoFilePath;
    
    public Message(String sender, String recipient, String companyName, 
                   String jobTitle, String content, String logoFilePath) {
        this.sender = sender;
        this.recipient = recipient;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.content = content;
        this.logoFilePath = logoFilePath;
    }
    
    // Getters and setters
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
    
    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }
    
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}