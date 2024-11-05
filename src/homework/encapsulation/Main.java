package homework.encapsulation;

public class Main {

    // Creating method main that prints information about student
    public static void main(String[] args) {
        Subject subject = new Subject("Math", "Jeremy");
        Student student = new Student("Alex", 18, subject);

        System.out.println(student);
    }
}
