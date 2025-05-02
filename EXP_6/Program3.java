package EXP_6;
import StudentRecords.Student;
//3) In a Student Records Management System, personal and academic details of students need to be stored securely while providing controlled access to their data. Create a package named StudentRecords containing a class Student with private attributes studentId, name, and grade. Provide a public constructor to initialize these attributes and a method displayStudentInfo() to print student details. Then, write another program outside the package that imports StudentRecords, creates Student objects, and displays their details. This exercise will illustrate how encapsulation is maintained in Java, allowing data to be accessed only through well-defined public methods while preventing direct modification of private fields.
public class Program3 {
        public static void main(String[] args) {
            // Creating Student objects
            Student student1 = new Student("101", "Priyambad", "A");
            Student student2 = new Student("102", "Ram", "B+");

            // Displaying student details
            student1.displayStudentInfo();
            student2.displayStudentInfo();
        }
    }

