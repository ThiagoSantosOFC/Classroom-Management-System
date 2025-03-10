# Classroom Management System

This project implements a classroom management system using object-oriented programming principles in Java. The system models the interactions between **Professors**, **Students**, and **Lessons** while demonstrating the use of design patterns like **Observer** to manage updates and notifications.

## Features

- **Identifiable Entities**: All entities (Professors, Students, Lessons) have unique identifiers.
- **Observer Pattern**: Students receive notifications when a Professor updates a lesson summary.
- **Professor and Student Management**: Professors can add/remove lessons, while students can enroll in or leave lessons and receive updates when the lesson summary changes.
- **Lesson Management**: Professors can fill in summaries for lessons, and students are notified of updates to the lesson summary.

## Design Patterns Used

### Observer Pattern
The **Observer Pattern** is used to notify students when a professor updates a lesson summary. This allows students to automatically receive updates without the professor having to manually notify each one.

### Other Design Patterns
- **Strategy Pattern** (optional): This can be added to enable flexible behaviors related to lesson summaries or lesson management, allowing the behavior to vary without modifying core classes.

## Classes Overview

- **Identifiable Interface**: Guarantees that all entities have a unique identifier.
- **Person Class**: A base class for both Professors and Students that includes the name and unique identifier.
- **Observer Interface**: Allows students to receive updates when a professor makes changes to a lesson.
- **Subject Class**: Maintains a list of observers (students) and notifies them when the lesson summary is updated.
- **Professor Class**: Allows professors to add/remove lessons and edit summaries for those lessons.
- **Student Class**: Implements the Observer interface to receive notifications when lesson summaries are updated.
- **Lesson Class**: Represents a lesson, including its name, number, summary, and associated students.

## Getting Started

To use this project locally, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/ThiagoSantosOFC/classroom-management.git
    ```

2. Open the project in your favorite IDE (e.g., IntelliJ IDEA).

3. Build and run the project.

4. You can execute the program by running the `Main` class, which demonstrates how Professors, Students, and Lessons interact in the system.

