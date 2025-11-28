# 📖 Job Portal System - User Manual

## 🎯 Getting Started

### System Requirements
- **Java**: Version 17 or higher
- **JavaFX**: Version 19 or higher
- **RAM**: Minimum 2GB
- **Storage**: 100MB free space

### Installation
1. Ensure Java 17+ is installed on your system
2. Download JavaFX SDK from [OpenJFX.io](https://openjfx.io/)
3. Extract JavaFX to a folder (e.g., `C:/javafx-sdk-19/`)

## 👥 User Guides

### For Job Seekers

#### Registration
1. Click "Sign Up" on main screen
2. Select "Job Seeker" role
3. Fill in:
   - Full Name
   - Valid Email  
   - Password (min. 6 characters)
   - Upload Profile Picture
4. Submit and wait for admin approval

#### Applying for Jobs
1. Browse available jobs in dashboard
2. Use search to filter by title
3. Click "View" to see job details
4. Click "Apply" to fill application form
5. Upload required documents (Resume PDF)
6. Submit application

#### Managing Applications
- **Saved Jobs**: Click "Save" on job cards
- **Application History**: View all applied jobs
- **Messages**: Communicate with employers

### For Employers

#### Registration & Verification
1. Click "Sign Up" and select "Employer"
2. Complete basic registration
3. Login and complete Tureth verification:
   - Select your company from dropdown
   - Enter 9-digit company ID
4. Setup company profile with logo and description

#### Posting Jobs
1. Click "Post New Job" in company dashboard
2. Fill job details:
   - Title, Description, Type
   - Vacancies, Qualifications, Skills
   - Experience, Salary, Location
   - Application Deadline
3. Submit job posting

#### Managing Applicants
1. Click "View Applicants"
2. Select job posting from dropdown
3. View applicant list with profiles
4. Send messages to applicants
5. View applicant details and documents

### For Administrators

#### Login
- Use "Admin" button on main screen
- Password: `job1234`

#### User Management
1. View all registered users
2. Approve/Reject pending registrations
3. Block inactive users
4. Delete users if needed

#### Company Management
1. Add new Tureth companies:
   - Company Name
   - 9-digit ID
2. Remove existing companies

## 🔧 Troubleshooting

### Common Issues

**❌ Application won't start**
- Check Java version: `java -version`
- Verify JavaFX path in run command
- Ensure sufficient system memory

**❌ Can't login after registration**
- Account might be pending admin approval
- Check email and password accuracy
- Contact admin if rejected or blocked

**❌ File upload issues**
- Ensure files are correct format:
  - Images: JPG, JPEG, PNG
  - Resumes: PDF only
- Check file size (recommend < 5MB)

**❌ Data not saving**
- Check write permissions in application directory
- Ensure `data/` folder exists
- Verify no other instance is running

Linux/Mac:
```
java --module-path "/path/to/javafx/lib" --add-modules javafx.controls,javafx.fxml -cp src Job

### Run Commands

**Windows:**
```cmd
java --module-path "C:\path\to\javafx\lib" --add-modules javafx.controls,javafx.fxml -cp src Job