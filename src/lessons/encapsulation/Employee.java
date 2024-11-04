package lessons.encapsulation;

public class Employee {

    private String name;
    private Department employeeDepartment;

    public Employee(String name, Department employeeDepartment) {
        this.name = name;
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeDepartment(Department employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + "\n" +
            "Department: " + employeeDepartment.toString();
    }
}
