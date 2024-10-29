package homework;

public class Main {

    public static void main(String[] args) {

        // Creating first object
        Employee emp1 = new Employee("Tom", 2000, 35);
        System.out.println(emp1.getEmployeeInformation());
        System.out.println(emp1.getEmployeeStatus());

        // Creating second object
        Employee emp2 = new Employee("Jessica", 5000, 55);
        emp2.getEmployeeInformation();
        emp2.getEmployeeStatus();

        // Creating object with default constructor
        Employee emp = new Employee();
        emp.getEmployeeInformation();
        emp.getEmployeeStatus();
    }
}
