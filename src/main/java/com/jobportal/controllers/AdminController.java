package com.jobportal.controllers;

import com.jobportal.models.AdminCompany;
import com.jobportal.models.User;
import com.jobportal.utils.FileHandler;

import java.util.List;

public class AdminController {
    private static List<User> users = FileHandler.loadUsers();
    private static List<AdminCompany> adminCompanies = FileHandler.loadAdminCompanies();
    
    public static boolean approveUser(String email) {
        User user = users.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElse(null);
        
        if (user != null && "Pending".equals(user.getStatus())) {
            user.setStatus("Approved");
            return FileHandler.saveUsers(users);
        }
        return false;
    }
    
    public static boolean rejectUser(String email) {
        User user = users.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElse(null);
        
        if (user != null && "Pending".equals(user.getStatus())) {
            user.setStatus("Rejected");
            return FileHandler.saveUsers(users);
        }
        return false;
    }
    
    public static boolean addAdminCompany(String name, String id) {
        if (adminCompanies.stream().anyMatch(ac -> ac.getName().equals(name) || ac.getId().equals(id))) {
            return false;
        }
        
        AdminCompany newCompany = new AdminCompany(name, id);
        adminCompanies.add(newCompany);
        return FileHandler.saveAdminCompanies(adminCompanies);
    }
    
    public static List<User> getPendingUsers() {
        return users.stream()
                .filter(u -> "Pending".equals(u.getStatus()))
                .collect(java.util.stream.Collectors.toList());
    }
}