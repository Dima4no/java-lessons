package homework;

public class Employee {

    // Creating fields of class Employee
    String name;
    int salary;
    int workHours;

    // Creating constructor of class Employee
    public Employee(String nameOfEmp, int salaryOfEmp, int workHoursOfEmp) {
        name = nameOfEmp;
        salary = salaryOfEmp;
        workHours = workHoursOfEmp;
    }

    // Creating Default constructor
    public Employee() {
        name = "EMPTY";
        salary = 0;
        workHours = 0;
    }

    // Creating method that prints employee information
    public String getEmployeeInformation() {
        return "Employee name: " + name + ", employee salary: " + salary + ", employee work hours: " + workHours;
    }

    // Creating method that prints work status of employee
    public String getEmployeeStatus() {
        if (workHours == 40) {
            return "Полный рабочий график";
        } else if (workHours < 20) {
            return "Интерн";
        } else if (workHours < 40) {
            return "Неполный график";
        } else {
            return "Переработка!!!";
        }
    }
}
// Finished coding