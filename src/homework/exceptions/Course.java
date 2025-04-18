package homework.exceptions;

public class Course {
    private String courseId;
    private String courseName;
    private int maxCapacity;
    private int currentEnrollment = 0;

    public Course(String courseId, String courseName, int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setCurrentEnrollment(int currentEnrollment) {
        this.currentEnrollment = currentEnrollment;
    }

    public void growCurrentEnrollment() {
        currentEnrollment++;
    }

    public void shrinkCurrentEnrollment() {
        if (currentEnrollment > 0) {
            currentEnrollment--;
        }
    }
}
