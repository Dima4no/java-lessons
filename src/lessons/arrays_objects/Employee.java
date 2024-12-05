package lessons.arrays_objects;

import java.util.UUID;
import lessons.encapsulation.Department;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
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
}
