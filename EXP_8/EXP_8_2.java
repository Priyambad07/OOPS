package EXP_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXP_8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter Grade: ");
        String grade = input.nextLine();

        try (FileWriter writer = new FileWriter("student.txt", true)) { // Append mode
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
        input.close();
    }
}
