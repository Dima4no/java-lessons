package lessons.classes_and_objects;

public class Student {

    int id;
   private String name;
    String faculty;

    public Student(int studentId, String studentName, String studentFaculty) {
        id = studentId;
        name = studentName;
        faculty = studentFaculty;
    }

    public Student(){
        id = 0;
        name = "-";
        faculty = "-";
    }

    public String getStudentInfo(){
        return "Student id: " + id + ", name: " + name + ", faculty: " + faculty;
    }
}
