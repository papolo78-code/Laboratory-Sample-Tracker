# Laboratory Sample Tracker

## Project Overview

The Laboratory Sample Tracker is an Android application designed to assist chemical laboratory personnel with recording and tracking samples throughout the testing and reporting process.

## Business Problem

Chemical laboratories may process numerous samples at different stages of analysis. Laboratory personnel need an efficient method for identifying when samples are received, what testing is required, their priority, and their current status. The Laboratory Sample Tracker will provide an organized mobile solution for managing this information.

## Project Objectives

The objectives of this application are to:

- Record laboratory sample information.
- Track samples throughout the laboratory workflow.
- Identify the status and priority of samples.
- Provide a simple and user-friendly mobile interface.
- Explore how mobile and cloud technologies can improve laboratory operations.

## Planned Application Features

The application is planned to include:

- Sample ID
- Date Received
- Test Type
- Priority
- Sample Status
- Save Sample functionality
- Sample search functionality

## Current Development Status

The Laboratory Sample Tracker has progressed from initial planning into the design and development planning stage. The business problem, project objectives, application requirements, and proposed features have been identified. We created an initial wireframe and applied user-interface design principles to the proposed application layout.

The next stage will focus on developing functional application components, testing the user interface, implementing sample-tracking functionality, and preparing the application code for final submission.

## Project Documentation

The project's GitHub Wiki contains detailed information on planning, design, wireframing, development progress, and future updates for the Laboratory Sample Tracker.

## Version Changelog

### Version 0.1 - Initial Planning
**Previous Update**

- Identified the business problem for the Laboratory Sample Tracker.
- Established the initial application concept and objectives.
- Identified the primary application requirements.
- Created the GitHub repository and project documentation.
- Created the initial project outline.

### Version 0.2 - Design and Development Planning
**Current Update**

- Created an initial paper wireframe for the application.
- Developed the proposed user interface and navigation structure.
- Identified important application fields, including Sample ID, Date Received,
  Test Type, Priority, and Sample Status.
- Applied mobile application design and user-interface principles.
- Expanded the GitHub Wiki with wireframe and application design documentation.
- Evaluated potential cloud and data requirements for future development.
- Updated the README to reflect current project progress.

### Version 0.3 - Planned Development
**Future Updates**

- Develop the functional application interface.
- Implement sample entry and sample status functionality.
- Add validation for required sample information.
- Test application navigation and usability.
- Evaluate local and cloud-based data storage options.
- Debug identified application issues.
- Upload application code and supporting files to GitHub.
- Prepare the application and documentation for final submission in Module 8.

## Week 6 Development Update

During Week 6, development of the Laboratory Sample Tracker moved from the planning and design stages into Android application development. The project was created in Android Studio using Kotlin and Jetpack Compose.

The initial Android project structure has been established, including the MainActivity, application theme files, Android manifest, and Gradle build configuration. The MainActivity currently provides the starting point for the application's user interface and confirms that the basic Jetpack Compose structure is in place.

### Work Completed

- Created the Laboratory Sample Tracker project in Android Studio.
- Configured the application to use Kotlin and Jetpack Compose.
- Created and configured MainActivity.kt.
- Added the Compose theme files: Color.kt, Theme.kt, and Type.kt.
- Added the AndroidManifest.xml file.
- Added project-level and application-level Gradle build configuration files.
- Successfully compiled the Android project using Gradle.
- Began testing the application with the Android Emulator.
- Uploaded the current application source code and configuration files to GitHub.

### Current Status

The basic Android application structure is now established, and the project builds successfully. Emulator testing was started during this development phase; however, the Android virtual device environment requires additional troubleshooting before application testing can continue.

### Next Steps

The next development phase will focus on building the Laboratory Sample Tracker user interface and implementing the planned sample-management features. This will include fields for sample information, status, and priority, as well as functionality to save and manage laboratory sample records.

### Technical Challenges and Limitations

Several technical issues arose while configuring and running the Android Studio emulator during development of the Laboratory Sample Tracker application. Although the application project compiled successfully with Gradle, attempts to run it on the Android Virtual Device (AVD) failed.

During testing, the emulator abruptly shut down and showed error messages stating that the virtual device was offline. Other problems included plugin-related exceptions and Android Studio launch difficulties. Troubleshooting included reinstalling Android Studio, reviewing the virtual device configuration, and turning off a problematic IDE plugin. 

Despite these difficulties, Gradle built the project successfully, and the configuration files and application source code were published to GitHub. To track development and maintain the project's source code, the team used GitHub. 

The application's ability to run successfully on an Android emulator has not yet been confirmed. We will fix the emulator issues, test the application, and implement the remaining laboratory sample tracking functionalities.

### Module 7 - Application Development Progress

The Laboratory Sample Tracker application continued to be developed using Kotlin with Jetpack Compose throughout Module 7. After being updated, the application's source code was added to the GitHub repository.

### Features Implemented in Source Code

•	Added a Department drop-down menu with three laboratory divisions: Controlled Substance, Trade, and Other Forensics.
•	Developed input fields for Sample ID, Date Received, Test Type, Priority, and Sample Status.
•	Added validation to check that required sample information is entered.
•	Updated the Save Sample button to add records to an in-memory list.
•	Added a section that displays entered laboratory samples in individual cards.
•	Included a counter showing the total number of samples entered.

### Technical Challenges

Three laboratory departments—Controlled Substance, Trade, and Other Forensics—were added to the Department dropdown menu. Sample ID, Date Received, Test Type, Priority, and Sample Status input fields were created. Validation was included to ensure that the necessary sample data was entered. To add entries to an in-memory list, the Save Sample button has been updated. A feature that shows entered laboratory samples on individual cards has been added. included a counter that displayed the total number of samples that were submitted.

The sample storage functionality currently uses temporary memory. Records will not persist after the application closes.

### Future Development - Module 8

The application code will be reviewed, any compilation problems will be fixed, persistent sample storage will be implemented if possible, and the final project submission will be prepared. 

The application's development progress, features that have been incorporated, and known constraints will all be documented in the GitHub repository.
