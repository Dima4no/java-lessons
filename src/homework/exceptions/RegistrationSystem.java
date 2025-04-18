package homework.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class RegistrationSystem {
    private Map<String, Course>courses;
    private Map<String, Student> students;

    public RegistrationSystem(Map<String, Course> courses, Map<String, Student> students) {
        this.courses = courses;
        this.students = students;
    }

    public Course checkCourseExists(String courseId) throws CourseNotFoundException {
        if (!courses.containsKey(courseId)) {
            throw new CourseNotFoundException("Oops, the course with ID '"
                    + courseId + "' does not exist!");
        }
        return courses.get(courseId);
    }

    public Student checkStudentExists(String studentId) throws IllegalArgumentException {
        if (!students.containsKey(studentId)) {
            throw new IllegalArgumentException("Oops, the student with ID '"
                    + studentId + "' does not exist!");
        }
        return students.get(studentId);
    }

    public void enrollStudent(String studentId, String courseId)
            throws CourseNotFoundException, CourseFullException, DuplicateEnrollmentException {

        Course course = checkCourseExists(courseId);
        Student student = checkStudentExists(studentId);

        if (course.getCurrentEnrollment() >= course.getMaxCapacity()) {
            throw new CourseFullException("Wow, this course is already full!");
        }

        if (student.getCurrentCourses().contains(courseId)) {
            throw new DuplicateEnrollmentException("The student with ID '"
                    + studentId + "' is already enrolled in this course!");
        }

        student.getCurrentCourses().add(courseId);
        course.growCurrentEnrollment();
    }

    public void dropCourse(String studentId, String courseId) throws CourseNotFoundException {

        Course course = checkCourseExists(courseId);
        Student student = checkStudentExists(studentId);

        if (student.getCurrentCourses().contains(courseId)) {
            student.getCurrentCourses().remove(courseId);
            course.shrinkCurrentEnrollment();

        } else {
            throw new IllegalStateException("The student with ID '"
                    + studentId + "' is not enrolled in this course.");
        }
    }

    public void addCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Incorrect input!");
        }
        String courseId = course.getCourseId();
        if (courses.containsKey(courseId)) {
            throw new IllegalArgumentException("A course with ID '"
                    + courseId + "' already exists!");
        }

        courses.put(courseId, course);
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student can not be null!");
        }

        String name = student.getName();
        String studentId = student.getStudentId();

        if (name == null || name.isBlank()
                ||studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("Student name or ID cannot be null or blank!");
        }

        if (students.containsKey(studentId)) {
            throw new IllegalArgumentException("The student already exists!");
        }

        students.put(studentId, student);
    }

    public List<String> getStudentCourses(String studentId) {
        if (!students.containsKey(studentId)) {
            throw new IllegalArgumentException("The student with ID '"
                    + studentId + "' does not exist!");
        }
        return new ArrayList<>(students.get(studentId).getCurrentCourses());
    }
}
