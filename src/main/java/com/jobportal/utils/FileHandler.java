package com.jobportal.utils;

import com.jobportal.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String USERS_FILE = "data/users.dat";
    private static final String COMPANIES_FILE = "data/companies.dat";
    private static final String JOBS_FILE = "data/jobs.dat";
    private static final String MESSAGES_FILE = "data/messages.dat";
    private static final String FORMS_FILE = "data/forms.dat";
    private static final String ADMIN_COMPANIES_FILE = "data/admin_companies.dat";
    
    static {
        // Create data directory if it doesn't exist
        new File("data").mkdirs();
    }
    
    // User methods
    public static List<User> loadUsers() {
        return loadFromFile(USERS_FILE);
    }
    
    public static boolean saveUsers(List<User> users) {
        return saveToFile(USERS_FILE, users);
    }
    
    // JobPosting methods
    public static List<JobPosting> loadJobPostings() {
        return loadFromFile(JOBS_FILE);
    }
    
    public static boolean saveJobPostings(List<JobPosting> jobs) {
        return saveToFile(JOBS_FILE, jobs);
    }
    
    // AdminCompany methods
    public static List<AdminCompany> loadAdminCompanies() {
        List<AdminCompany> companies = loadFromFile(ADMIN_COMPANIES_FILE);
        if (companies.isEmpty()) {
            // Add default companies
            companies.add(new AdminCompany("Ethio Telecom", "123456789"));
            companies.add(new AdminCompany("Safaricom Ethiopia", "987654321"));
            companies.add(new AdminCompany("ArifPay", "112233445"));
            saveAdminCompanies(companies);
        }
        return companies;
    }
    
    public static boolean saveAdminCompanies(List<AdminCompany> companies) {
        return saveToFile(ADMIN_COMPANIES_FILE, companies);
    }
    
    // Generic file operations
    @SuppressWarnings("unchecked")
    private static <T> List<T> loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename + ", starting with empty list");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading from " + filename + ": " + e.getMessage());
        }
        return new ArrayList<>();
    }
    
    private static <T> boolean saveToFile(String filename, List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(data);
            return true;
        } catch (IOException e) {
            System.out.println("Error saving to " + filename + ": " + e.getMessage());
            return false;
        }
    }
}