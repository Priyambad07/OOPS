package EXP_5;
//2. Design a Java class Employee with attributes name, empid, and salary. Implement a default
//constructor, a parameterized constructor, and methods to return the employee’s name and salary. Add a method increaseSalary(double percentage) to raise the salary by a userspecified percentage. Create a subclass Manager with an additional instance variable department. Develop a test program to validate these functionalities.
import java.util.Scanner;

class Employee {
    private String name;
    private int empid;
    private double salary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

    // Display Employee details
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Display Manager details
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        Employee emp = new Employee(empName, empId, empSalary);

        emp.display();
        System.out.print("Enter salary increment percentage: ");
        double increment = scanner.nextDouble();
        emp.increaseSalary(increment);
        System.out.println("After salary increment:");
        emp.display();

        scanner.nextLine(); // Consume newline character

        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int mgrId = scanner.nextInt();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Department: ");
        String department = scanner.nextLine();

        Manager mgr = new Manager(mgrName, mgrId, mgrSalary, department);
        System.out.println("\nManager Details:");
        mgr.display();

        scanner.close();
    }
}
