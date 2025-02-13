package EXP_5;
//5. Imagine you’re designing a restaurant management system where you have a base class called Chef with a method makeSpecialDish(). This method simply prints a generic message indicating that the chef is making a special dish. Next, create three subclasses called ItalianChef, ChineseChef, and MexicanChef—each overrides makeSpecialDish() with a distinct print statement, such as "Making pasta", "Making dumplings", or "Making tacos".In your main method, declare an array or list of Chef references, but assign each element to a different subclass (ItalianChef, ChineseChef, MexicanChef). Use a loop to call the makeSpecialDish() method on each array element and observe how runtime polymorphism ensures that the correct subclass version of makeSpecialDish() is invoked.
import java.util.Scanner;

// Base class Chef
class Chef {
    public void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}

// Subclass ItalianChef overriding makeSpecialDish()
class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making pasta");
    }
}

// Subclass ChineseChef overriding makeSpecialDish()
class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making dumplings");
    }
}

// Subclass MexicanChef overriding makeSpecialDish()
class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making tacos");
    }
}

public class Program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of Chef references
        Chef[] chefs = new Chef[3];

        // Taking user input to determine chef types
        for (int i = 0; i < 3; i++) {
            System.out.println("Choose a chef type (1: Italian, 2: Chinese, 3: Mexican): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    chefs[i] = new ItalianChef();
                    break;
                case 2:
                    chefs[i] = new ChineseChef();
                    break;
                case 3:
                    chefs[i] = new MexicanChef();
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to a generic chef.");
                    chefs[i] = new Chef();
            }
        }

        // Demonstrating polymorphism
        System.out.println("\nSpecial dishes being made:");
        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }

        scanner.close();
    }
}
