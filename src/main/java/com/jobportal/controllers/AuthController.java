package com.jobportal.controllers;

import com.jobportal.models.User;
import com.jobportal.utils.FileHandler;
import com.jobportal.utils.Validation;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.util.List;

public class AuthController {
    private static List<User> users = FileHandler.loadUsers();
    
    public static void showMainWindow(Stage stage) {
        // Implementation for main window
        System.out.println("Showing main window");
    }
    
    public static boolean registerUser(String name, String email, String password, 
                                     String userType, String companyName, String profileImagePath) {
        if (!Validation.isValidEmail(email)) {
            showAlert("Invalid email format");
            return false;
        }
        
        if (password.length() < 6) {
            showAlert("Password must be at least 6 characters");
            return false;
        }
        
        if (users.stream().anyMatch(u -> u.getEmail().equals(email))) {
            showAlert("Email already registered");
            return false;
        }
        
        User newUser = new User(name, email, password, userType, companyName, profileImagePath);
        users.add(newUser);
        FileHandler.saveUsers(users);
        return true;
    }
    
    public static User loginUser(String email, String password) {
        return users.stream()
                .filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
    
    private static void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}