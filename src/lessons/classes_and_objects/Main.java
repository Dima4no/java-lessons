package lessons.classes_and_objects;

public class Main {

    public static void main(String[] args) {

        // класс переменная = new класс();

//        Student st1 = new Student(1, "Tom", "CS"); // объект
//        st1.id = 1;
//        st1.name = "Tom";
//        st1.faculty = "CS";

        Student st1 = new Student(1, "Tom", "CS"); // объект

        System.out.println(st1.getStudentInfo());

        Student st2 = new Student();
        System.out.println(st2.getStudentInfo());


    }

}
