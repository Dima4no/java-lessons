package lessons.arrays_objects;

import java.util.UUID;
import lessons.encapsulation.Department;

public class Employee {

    private UUID id;
    private String name;
    private double salary;
    private Department department;

    public Employee(String name, double salary, Department department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            ", department=" + department +
            '}';
    }
}
