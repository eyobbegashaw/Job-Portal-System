@echo off
title Job Portal System
echo Starting Job Portal Application...

set JAVA_HOME="C:\Program Files\Java\jdk-17"
set JAVAFX_PATH="C:\path\to\javafx-sdk-19\lib"

java --module-path %JAVAFX_PATH% --add-modules javafx.controls,javafx.fxml com.jobportal.Job

pause