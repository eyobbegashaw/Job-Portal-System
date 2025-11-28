#!/bin/bash
echo "Starting Job Portal System..."

JAVA_HOME="/usr/lib/jvm/java-17-openjdk"
JAVAFX_PATH="/path/to/javafx-sdk-19/lib"

java --module-path $JAVAFX_PATH --add-modules javafx.controls,javafx.fxml com.jobportal.Job