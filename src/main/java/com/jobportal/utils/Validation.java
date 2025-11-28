package com.jobportal.utils;

import java.util.regex.Pattern;

public class Validation {
    private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    private static final Pattern PHONE_PATTERN = 
        Pattern.compile("^\\+251[97]\\d{8}$");
    private static final Pattern URL_PATTERN = 
        Pattern.compile("^(https?://)?([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$");
    private static final Pattern NUMBER_PATTERN = 
        Pattern.compile("^\\d+$");
    private static final Pattern GPA_PATTERN = 
        Pattern.compile("^\\d*\\.?\\d{1,2}$");
    
    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static boolean isValidPhone(String phone) {
        return phone != null && PHONE_PATTERN.matcher(phone).matches();
    }
    
    public static boolean isValidUrl(String url) {
        return url == null || url.isEmpty() || URL_PATTERN.matcher(url).matches();
    }
    
    public static boolean isValidNumber(String number) {
        return number != null && NUMBER_PATTERN.matcher(number).matches();
    }
    
    public static boolean isValidGPA(String gpa) {
        return gpa == null || gpa.isEmpty() || GPA_PATTERN.matcher(gpa).matches();
    }
    
    public static boolean isValidCompanyId(String id) {
        return id != null && id.matches("\\d{9}");
    }
}