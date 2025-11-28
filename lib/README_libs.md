
```markdown
# 📚 JavaFX Libraries Setup

## Download JavaFX

1. Go to [OpenJFX.io](https://openjfx.io/)
2. Download JavaFX SDK for your operating system
3. Extract the downloaded zip file
4. Note the path to the `lib` folder

## Required JavaFX Modules
- javafx.controls
- javafx.fxml
- javafx.base
- javafx.graphics

## Setup Instructions

### Option 1: Add to IDE
1. In your IDE, add the JavaFX lib folder to project libraries
2. Add VM options: `--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`

### Option 2: Command Line
```bash
# Compile
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/Job.java

# Run
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml Job