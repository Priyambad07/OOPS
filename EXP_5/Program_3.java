package EXP_5;
//3. A university has different types of people associated with it, including staff members and students. The base class Person contains common attributes such as name, age, and address.The class Staff extends Person and adds attributes like staffId and department. Further, a subclass Professor extends Staff by introducing an additional attribute, specialization, and a method conductLecture(). Similarly, the Student class extends Person and adds studentId and course. Finally, the subclassGraduateStudent extends Student, adding researchTopic and a method submitThesis(). Implement this university management system in Java using multilevel inheritance andmethodoverriding.Demonstrate polymorphism by creating an array of Person objects containing instances of Professor and GraduateStudent, and call their respective methods.
import java.util.Scanner;

// Base class Person
class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Staff class extending Person
class Staff extends Person {
    protected int staffId;
    protected String department;

    public Staff(String name, int age, String address, int staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

// Professor class extending Staff
class Professor extends Staff {
    private String specialization;

    public Professor(String name, int age, String address, int staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

// Student class extending Person
class Student extends Person {
    protected int studentId;
    protected String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// GraduateStudent class extending Student
class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, int studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println(name + " has submitted a thesis on " + researchTopic);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
    }
}
public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Professor
        System.out.println("Enter Professor details:");
        System.out.print("Name: ");
        String profName = scanner.nextLine();
        System.out.print("Age: ");
        int profAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String profAddress = scanner.nextLine();
        System.out.print("Staff ID: ");
        int profStaffId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String profDepartment = scanner.nextLine();
        System.out.print("Specialization: ");
        String specialization = scanner.nextLine();

        Professor professor = new Professor(profName, profAge, profAddress, profStaffId, profDepartment, specialization);

        // Taking input for GraduateStudent
        System.out.println("\nEnter Graduate Student details:");
        System.out.print("Name: ");
        String gradName = scanner.nextLine();
        System.out.print("Age: ");
        int gradAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String gradAddress = scanner.nextLine();
        System.out.print("Student ID: ");
        int gradStudentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Course: ");
        String gradCourse = scanner.nextLine();
        System.out.print("Research Topic: ");
        String researchTopic = scanner.nextLine();

        GraduateStudent graduateStudent = new GraduateStudent(gradName, gradAge, gradAddress, gradStudentId, gradCourse, researchTopic);

        // Storing objects in a Person array for polymorphism demonstration
        Person[] people = {professor, graduateStudent};

        // Displaying details and invoking respective methods
        for (Person p : people) {
            p.display();
            if (p instanceof Professor) {
                ((Professor) p).conductLecture();
            } else if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
            System.out.println();
        }

        scanner.close();
    }
}
