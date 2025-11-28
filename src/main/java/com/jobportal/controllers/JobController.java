package com.jobportal.controllers;

import com.jobportal.models.JobPosting;
import com.jobportal.utils.FileHandler;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class JobController {
    private static List<JobPosting> jobPostings = FileHandler.loadJobPostings();
    
    public static List<JobPosting> getActiveJobs() {
        LocalDate today = LocalDate.now();
        return jobPostings.stream()
                .filter(job -> !job.getDeadline().isBefore(today))
                .collect(Collectors.toList());
    }
    
    public static List<JobPosting> getJobsByCompany(String companyName) {
        return jobPostings.stream()
                .filter(job -> job.getCompanyName().equals(companyName))
                .collect(Collectors.toList());
    }
    
    public static boolean postJob(JobPosting job) {
        jobPostings.add(job);
        return FileHandler.saveJobPostings(jobPostings);
    }
    
    public static boolean deleteJob(JobPosting job) {
        boolean removed = jobPostings.remove(job);
        if (removed) {
            FileHandler.saveJobPostings(jobPostings);
        }
        return removed;
    }
}