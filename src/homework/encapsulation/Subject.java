package homework.encapsulation;

public class Subject {

    // Creating fields of class
    private String title;
    private String teacherName;

    // Creating constructor
    public Subject(String title, String teacherName) {
        this.title = title;
        this.teacherName = teacherName;
    }

    // Overriding method that returns information about subject
    @Override
    public String toString() {
        return title + "\n" +
                "Teacher name: " + teacherName;
    }
}
