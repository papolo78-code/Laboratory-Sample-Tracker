## Laboratory Sample Tracker

## Project Overview

The Laboratory Sample Tracker is an Android mobile application designed to help chemical and forensic laboratory personnel organize, record, and monitor samples throughout the testing and reporting process.

The project focuses on improving sample identification, departmental organization, priority tracking, and laboratory workflow management.

Course: COM-437: Operating Systems
Project: Module 8 Final Project
Development Platform: Android Studio
Programming Language: Kotlin
User Interface: Jetpack Compose

## Business Problem

Laboratories may receive numerous samples requiring different types of analysis. Tracking sample information, testing priorities, and processing status can become difficult when records are not organized consistently.

The Laboratory Sample Tracker aims to provide a simple mobile interface that helps laboratory personnel manage essential sample information and monitor laboratory workflow.

## Project Objectives

Record and organize laboratory sample information.

Identify the department responsible for each sample.

Track sample priority and processing status.

Provide a simple, user-friendly Android interface.

Reduce the difficulty of locating and reviewing sample information.

Explore future opportunities for permanent storage and improved sample management.

## Laboratory Departments

The application includes three department options:

Controlled Substance

Trade

Other Forensics

Users can select the appropriate department when entering sample information.

## Application Features

The current Kotlin source code includes:

Department selection using a dropdown menu.

Sample ID entry.

Date Received entry.

Test Type entry.

Priority entry.

Sample Status entry.

Required-field validation.

Save Sample button.

Temporary in-memory sample storage.

Display of entered samples in individual cards.

Total sample counter.

These features have been added to the source code but have not yet been verified through successful execution of the updated application.

## Application Design

The proposed application interface follows a simple, vertically organized layout.

Users begin by selecting a department, then enter the sample identification and testing information. The Save Sample button validates required fields and adds the record to a temporary list.

Entered samples are designed to appear below the form, allowing users to review their information.

The interface uses Jetpack Compose and Material Design components.

## Technology and Architecture

Front End

The application interface is developed using Kotlin and Jetpack Compose. Material Design components provide text fields, buttons, dropdown menus, and sample record cards.

Back End and Data Management

The current prototype uses an in-memory state list to manage sample records during an application session.

A persistent database or cloud-based back end has not yet been implemented. Future development may include a local database to retain records after the application closes.

## Development Progress and Version Changelog

Version 0.1 — Initial Planning

Identified the laboratory sample management problem.

Established the project objectives.

Defined the initial application requirements.

Created the GitHub repository and project outline.

Version 0.2 — Design and Planning

Developed the initial application wireframe.

Planned the user interface and navigation.

Identified essential sample tracking fields.

Expanded project documentation in the GitHub Wiki.

Version 0.3 — Android Project Development

Created the Android Studio project.

Established the Kotlin and Jetpack Compose application structure.

Uploaded available source code and configuration files to GitHub.

Successfully built an earlier version of the project using Gradle.

Version 0.4 — Sample Tracking Interface

Added department selection for Controlled Substance, Trade, and Other Forensics.

Implemented sample entry fields and basic validation.

Added temporary sample storage and sample record cards.

Added a total sample counter.

Updated the README and Wiki to document development progress.

Version 0.5 — Final Project Documentation

Prepared the Module 8 final project outline.

Prepared the final project presentation.

Updated the project documentation and version changelog.

Documented technical limitations and remaining development tasks.

## Technical Challenges and Limitations

During development, several technical difficulties occurred with Android Studio and the Android emulator.

The emulator unexpectedly closed or displayed messages indicating that the virtual device was offline. Troubleshooting included reinstalling Android Studio, reviewing emulator configuration, and addressing development environment issues.

Although an earlier version of the Android project built successfully using Gradle, the latest application code has not been successfully compiled or tested.

Development continued through GitHub to preserve source code and document project progress.

Current limitations:

Successful execution of the updated application has not been verified.

Sample records are stored temporarily in memory.

Records are not retained after the application closes.

Search functionality and permanent database storage remain future improvements.

The completeness of the GitHub repository as a standalone, buildable Android project still requires verification.

## Future Development

Future improvements may include:

Resolving emulator and build issues.

Implementing persistent sample storage.

Adding sample search and filtering.

Supporting sample record updates.

Improving date validation and status selection.

Expanding reporting and laboratory workflow features.

## Project Documentation

The GitHub Wiki contains the project outline, design information, development updates, and version changelog.

GitHub Repository:
https://github.com/papolo78-code/Laboratory-Sample-Tracker

GitHub Wiki:
https://github.com/papolo78-code/Laboratory-Sample-Tracker/wiki

## Final Project Status

The Laboratory Sample Tracker has progressed from initial planning to a Kotlin-based Android application prototype with a sample entry interface and temporary record management implemented in source code.

The project demonstrates the application of mobile software design, user-interface development, source control, and project documentation.

The updated application remains unverified due to development environment and emulator difficulties. These limitations have been documented as part of the final project submission.
