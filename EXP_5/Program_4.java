package EXP_5;
//4. Design an abstract class named Vehicle with abstract methods such as startEngine() and stopEngine(), as well as a non-abstract method serviceInfo() that prints basic servicing instructions. Include a couple of protected or private fields (e.g., make, model) and a constructor for Vehicle that initializes those fields.Create a concrete class Car that extends Vehicle and provides implementations for startEngine() and stopEngine(). Within these methods, include print statements or logic that simulates starting and stopping a car engine. Finally, instantiate a Car object in the main method, call all available methods (including the inherited non-abstract method), and verify that your abstraction works as intended.
import java.util.Scanner;

// Abstract class Vehicle
abstract class Vehicle {
    protected String make;
    protected String model;

    // Constructor to initialize vehicle properties
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();

    // Non-abstract method providing basic servicing information
    public void serviceInfo() {
        System.out.println("Servicing for " + make + " " + model + " should be done every 6 months or 5000 miles.");
    }
}

// Concrete class Car extending abstract class Vehicle
class Car extends Vehicle {

    public Car(String make, String model) {
        super(make, model);
    }

    // Implementing the abstract method startEngine()
    @Override
    public void startEngine() {
        System.out.println("The engine of " + make + " " + model + " is starting...");
    }

    // Implementing the abstract method stopEngine()
    @Override
    public void stopEngine() {
        System.out.println("The engine of " + make + " " + model + " is stopping...");
    }
}
public class Program_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for Car details
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        // Creating a Car object with user input
        Car myCar = new Car(make, model);

        // Calling methods to demonstrate abstraction
        myCar.startEngine();  // Calls the overridden method from Car class
        myCar.serviceInfo();  // Calls the inherited non-abstract method from Vehicle class
        myCar.stopEngine();   // Calls the overridden method from Car class

        scanner.close();
    }
}
