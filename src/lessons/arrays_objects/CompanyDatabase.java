package lessons.arrays_objects;

import java.util.UUID;
import lessons.encapsulation.Department;

public class CompanyDatabase {

    private Employee[] employees;
    private int initialCapacity;

    public CompanyDatabase(int initialCapacity) {
        this.employees = new Employee[initialCapacity];
    }

    public void addEmployee(Employee employee, int index) {
        if (index < 0 || index > employees.length) {
            System.out.println("Invalid index!");
        } else if (employees[index] != null) {
            System.out.println("Employee on this index already exists!");
        } else {
            // length = 3 -> 0 1 2
            if (index == employees.length) {
                growCapacity();
            }
            employees[index] = employee;
        }
    }

    public void addEmployee(String name, double salary, Department department, int index) {
        Employee employee = new Employee(name, salary, department);
        addEmployee(employee, index);
    }

    private void growCapacity() {
        Employee[] newEmployees = new Employee[employees.length + 1];
        for (int index = 0; index < employees.length; index++) {
            newEmployees[index] = employees[index];
        }
        employees = newEmployees;
    }

    public void updateEmployee(Employee employee, int index) {
        if (index < 0 || index > employees.length) {
            System.out.println("Invalid index!");
        } else if (employees[index] == null) {
            System.out.println("Employee on this index does not exist!");
        } else {
            employees[index] = employee;
        }
    }

    public void removeEmployeeById(UUID id) {
        for (int index = 0; index < employees.length; index++) {
            if (employees[index].getId().equals(id)) {
                employees[index] = null;
                return;
            }
        }
        System.out.println("Employee with id " + id + " does not exist!");
    }

    public void printEmployeeList() {
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null) {
                System.out.println(employees[index].toString());
            }
        }
    }
}
