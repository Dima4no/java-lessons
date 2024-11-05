package homework.encapsulation;

public class Student {

    // Creating fields of class
    private String name;
    private int studentId;
    private Subject studentSub;

    // Creating constructor
    public Student(String name, int studentId, Subject studentSub) {
        this.name = name;
        this.studentId = studentId;
        this.studentSub = studentSub;
    }

    // Setters
    public void setName(String name) {this.name = name;}
    public void setStudentId(int studentId) {this.studentId = studentId;}
    public void studentSub(Subject studentSub) {this.studentSub = studentSub;}

    // Getters
    public String getName() {return name;}
    public int getStudentId() {return studentId;}
    public Subject getStudentSub() {return studentSub;}

    // Overriding method toString() that returns information about student
    @Override
    public String toString() {
        return "Student name: " + name + "\n" +
                "ID: " + studentId + "\n" +
                "Subject: " + studentSub.toString();
    }
}

