package homework.exceptions;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        // Create courses
        Course javaCourse = new Course("C001", "Java Programming", 3);
        Course pythonCourse = new Course("C002", "Python Basics", 2);
        // Create students
        Student alice = new Student("S001", "Alice");
        Student bob = new Student("S002", "Bob");
        Student jack = new Student("S003", "Jack");
        // Create maps
        Map<String, Course> courses = new HashMap<>();
        Map<String, Student> students = new HashMap<>();
        // Create registration system
        RegistrationSystem system = new RegistrationSystem(courses, students);
        // Fill in maps
        system.addCourse(javaCourse);
        system.addCourse(pythonCourse);
        system.addStudent(alice);
        system.addStudent(bob);
        system.addStudent(jack);

        try {
            // Enroll students
            system.enrollStudent("S001", "C001");
            system.enrollStudent("S002", "C001");
            system.enrollStudent("S003", "C001");

            // This one should throw CourseFullException (only 2 spots in Python course)
            system.enrollStudent("S001", "C002");
            system.enrollStudent("S002", "C002");
            system.enrollStudent("S003", "C002"); // <-- This should fail

        } catch (CourseNotFoundException | CourseFullException | DuplicateEnrollmentException e) {
            System.out.println("Enrollment error: " + e.getMessage());
        }

        // Display student courses
        for (Student student : students.values()) {
            List<String> studentCourses = system.getStudentCourses(student.getStudentId());
            System.out.println("Courses for " + student.getName() + ": " + studentCourses);
        }

        // Try to drop a course
        try {
            system.dropCourse("S001", "C001");
            System.out.println("S001 dropped course C001");
        } catch (Exception e) {
            System.out.println("Drop error: " + e.getMessage());
        }
    }
}
