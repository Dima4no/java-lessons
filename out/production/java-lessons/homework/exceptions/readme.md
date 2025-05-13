# Student Course Registration System - Exception Handling Project

## Overview
Develop a course registration system where students can enroll in courses. The system handles various exceptions for registration limits, duplicate enrollments, and course availability.

## Learning Objectives
- Create and implement custom exceptions
- Handle Java built-in exceptions
- Use try-catch blocks effectively
- Work with `throws` declaration
- Understand exception hierarchy

## Required Classes

### 1. Course
**Required properties:**
- `courseId` (String): Unique identifier for the course.
- `courseName` (String): Name of the course.
- `maxCapacity` (int): Maximum number of students allowed in the course.
- `currentEnrollment` (int): Number of students currently enrolled.

### 2. Student
**Required properties:**
- `studentId` (String): Unique identifier for the student.
- `name` (String): Name of the student.
- `completedCourses` (List<String>): List of course IDs that the student has completed.
- `currentCourses` (List<String>): List of course IDs the student is currently enrolled in.

### 3. RegistrationSystem
Main system class that handles all operations related to course registration and student management.

**Attributes:**
- `courses` (Map<String, Course>): A map to store all courses, with `courseId` as the key and the `Course` object as the value.
- `students` (Map<String, Student>): A map to store all students, with `studentId` as the key and the `Student` object as the value.

**Methods:**

#### 1. `public void enrollStudent(String studentId, String courseId)`
Enrolls a student in a course. Handles exceptions like:
- `CourseFullException`: If the course has reached maximum capacity.
- `CourseNotFoundException`: If the course ID does not exist in the system.
- `DuplicateEnrollmentException`: If the student is already enrolled in the course.

**Logic:**
1. Validate if the `courseId` exists in `courses`. If not, throw `CourseNotFoundException`.
2. Validate if the `studentId` exists in `students`. If not, throw `IllegalArgumentException`.
3. Check if the course has available capacity. If not, throw `CourseFullException`.
4. Check if the student is already enrolled in the course. If so, throw `DuplicateEnrollmentException`.
5. Add the course to the student's `currentCourses` list and increment the `currentEnrollment` of the course.

---

#### 2. `public void dropCourse(String studentId, String courseId)`
Drops a student from a course. Handles exceptions like:
- `CourseNotFoundException`: If the course ID does not exist in the system.

**Logic:**
1. Validate if the `courseId` exists in `courses`. If not, throw `CourseNotFoundException`.
2. Validate if the `studentId` exists in `students`. If not, throw `IllegalArgumentException`.
3. Remove the course from the student's `currentCourses` list and decrement the `currentEnrollment` of the course.

---

#### 3. `public void addCourse(Course course)`
Adds a new course to the system. Throws:
- `IllegalArgumentException`: If the course ID or course name is null or empty, or if the course already exists.

**Logic:**
1. Validate the input course for non-null values.
2. Check if the course ID already exists in `courses`. If it does, throw `IllegalArgumentException`.
3. Add the course to the `courses` map.

---

#### 4. `public void addStudent(Student student)`
Adds a new student to the system. Throws:
- `IllegalArgumentException`: If the student ID or name is null or empty, or if the student already exists.

**Logic:**
1. Validate the input student for non-null values.
2. Check if the student ID already exists in `students`. If it does, throw `IllegalArgumentException`.
3. Add the student to the `students` map.

---

#### 5. `public List<String> getStudentCourses(String studentId)`
Retrieves the list of courses a student is currently enrolled in. Throws:
- `IllegalArgumentException`: If the student ID does not exist in the system.

**Logic:**
1. Validate if the `studentId` exists in `students`. If not, throw `IllegalArgumentException`.
2. Return the `currentCourses` list of the student.

---

## 4. Custom Exceptions
Create the following exception classes:
- `CourseFullException`
- `CourseNotFoundException`
- `DuplicateEnrollmentException`

## Exception Requirements

### CourseFullException
**Throw when:**
- Course has reached maximum capacity.
- Include current enrollment count and max capacity in the message.

### CourseNotFoundException
**Throw when:**
- Attempting to access a non-existent course.
- Include `courseId` in the message.

### DuplicateEnrollmentException
**Throw when:**
- Student tries to enroll in the same course twice.
- Include both `studentId` and `courseId` in the message.

## Implementation Requirements

### Custom Exception Classes
Custom exception classes must:
- Extend the `Exception` class.
- Include a default constructor.
- Include a parameterized constructor.
- Override the `toString()` method.

### Main Class
The main class must:
- Demonstrate all exception scenarios.
- Use appropriate try-catch blocks.
- Show meaningful error messages.
