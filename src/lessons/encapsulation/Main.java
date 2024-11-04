package lessons.encapsulation;

public class Main {

    public static void main(String[] args) {
        Department department = new Department("IT", 100, 1000000);
        Employee employee = new Employee("John", department);

        System.out.println(employee.toString());
    }

}
