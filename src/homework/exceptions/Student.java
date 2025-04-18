package homework.exceptions;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private List<String> completedCourses = new ArrayList<>();
    private List<String> currentCourses = new ArrayList<>();

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<String> getCompletedCourses() {
        return completedCourses;
    }

    public List<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompletedCourses(List<String> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public void setCurrentCourses(List<String> currentCourses) {
        this.currentCourses = currentCourses;
    }
}
