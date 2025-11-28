package com.jobportal;

import javafx.application.Application;
import javafx.stage.Stage;

public class Job extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Main application logic will be here
        // This is a placeholder - your original code should be refactored
        controllers.AuthController.showMainWindow(primaryStage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}