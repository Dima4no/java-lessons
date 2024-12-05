package lessons.arrays_objects;

import lessons.encapsulation.Department;

public class Main {

    public static void main(String[] args) {
        CompanyDatabase database = new CompanyDatabase(3);
        Department department = new Department("IT", 100, 1000000);
        database.addEmployee(new Employee("Tom", 1000, department ), 0);
        database.addEmployee(new Employee("Anna", 1000, department ), 0);
        database.addEmployee(new Employee("Bob", 1000, department ), 0);

        database.printEmployeeList();

    }

}
