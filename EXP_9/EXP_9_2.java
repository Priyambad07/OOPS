package EXP_9;

import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class EXP_9_2{

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1, 50000));
        employees.add(new Employee("Bob", 2, 60000));
        employees.add(new Employee("Charlie", 3, 55000));

        // Update salary of Bob
        for (Employee e : employees) {
            if (e.id == 2) {
                e.salary = 65000;
                break;
            }
        }

        // Remove Charlie
        employees.removeIf(e -> e.id == 3);

        System.out.println("Remaining Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
