// EXPERIMENT 3: Classes (Constructors, Access Modifiers, Method Overloading, Static & Non-Static Members, this)

// 1. Create a Book class with attributes title and author.
// Assign default values (e.g., "Untitled", "Unknown Author").
// Accept user-defined values for title and author.
// Add another constructor that also includes an integer parameter for publicationYear.
// Objective: Create multiple Book objects using the different constructors and display their details.

// 2.  Declare a Customer class with a private variable balance.
// Implement a public addBalance(double amount) method to add funds.
// Implement a protected deductBalance(double amount) method to reduce funds.
// Define a default-access (package-private) method showBalance() to display the current balance.
// Overload the addBalance(...) method to also accept an int amount for smaller deposits.
// Objective: Create an instance of the Customer class Showcase method overloading for different deposit parameters.

// 3. Create a Club class with a static variable clubName and a non-static variable memberName.
// Provide a static method displayClubName() to print the club’s name.Create multiple Club objects and assign different member names to each.
// Objective: Show how the static variable clubName is shared across all instances, while memberName remains unique to each object. Prove this by displaying each member’s name alongside the shared club name.

// 4. Define a Car class with attributes make, model, and year.
// Create a parameterized constructor that uses the this keyword to distinguish constructor parameters from the class fields (e.g., this.make = make;). Instantiate a Car object with specific values (e.g., "Tesla", "Model 3", 2025) and display its details, ensuring the correct assignment of attributes using this.


// 5.  A company wants to manage a list of products with details such as product ID, name, price, and category. They also want to keep track of the total number of products and calculate the overall stock value.
// Product Class:
// Instance variables: productId, productName, category.
// A private variable price.
// A default constructor setting some default values.
// A parameterized constructor that initializes product details using this to differentiate parameters from class fields.
// A public method getPrice() to access the private price.
// A public method displayProductInfo() to show all details.
// Static Members:
// A static variable totalProducts to count how many Product objects are created.
// A static method displayTotalProducts() to print the total count.
// Method to Calculate Stock Value:
// A method (e.g., calculateStockValue()) to multiply the price by a given quantity (demonstrate method overloading by adding an optional parameter for a discount rate).
// In the main method:
// Create multiple Product objects using both the default and parameterized constructors.
// Call the static method to display the total number of products.
// Display each product’s details, including the price and the calculated stock value for a given quantity.


import java.util.Scanner;

// 1. Book Class
class Book {
    String title;
    String author;
    int publicationYear;

    // Default constructor
    public Book() {
        this("Untitled", "Unknown Author");
    }

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor with publication year
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publicationYear);
    }
}

// 2. Customer Class
class Customer {
    private double balance;

    public void addBalance(double amount) {
        balance += amount;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    protected void deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// 3. Club Class
class Club {
    static String clubName = "Elite Members Club";
    String memberName;

    public Club(String memberName) {
        this.memberName = memberName;
    }

    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    public void displayMemberDetails() {
        System.out.println("Member: " + memberName + " | Club: " + clubName);
    }
}

// 4. Car Class
class Car {
    String make, model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// 5. Product Class
class Product {
    static int totalProducts = 0;
    int productId;
    String productName, category;
    private double price;

    public Product() {
        this(0, "Unnamed", "Uncategorized", 0.0);
    }

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category + ", Price: " + price);
    }

    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    public double calculateStockValue(int quantity, double discountRate) {
        return price * quantity * (1 - discountRate / 100);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class EXP_4{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Program 1
        System.out.println("PROGRAM 1");
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter publication year: ");
        int year = scanner.nextInt();
        // scanner.nextLine();

        Book userBook = new Book(title, author, year);
        userBook.displayDetails();

        // Program 2
        System.out.println("PROGRAM 2");
        Customer customer = new Customer();
        System.out.println("Enter deposit amount: ");
        double deposit = scanner.nextDouble();
        customer.addBalance(deposit);
        customer.showBalance();

        // Program 3
        System.out.println("PROGRAM 3");
        System.out.println("Enter club member name: ");
        scanner.nextLine();
        String memberName = scanner.nextLine();
        Club member = new Club(memberName);
        Club.displayClubName();
        member.displayMemberDetails();

        // Program 4
        System.out.println("PROGRAM 4");
        System.out.println("Enter car make: ");
        String make = scanner.nextLine();
        System.out.println("Enter car model: ");
        String model = scanner.nextLine();
        System.out.println("Enter car year: ");
        int carYear = scanner.nextInt();

        Car car = new Car(make, model, carYear);
        car.displayDetails();

        // Program 5
        System.out.println("PROGRAM 5");
        System.out.println("Enter product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter product category: ");
        String category = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter product quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(productId, productName, category, price);
        product.displayProductInfo();
        System.out.println("Stock Value: " + product.calculateStockValue(quantity));
        Product.displayTotalProducts();

        scanner.close();
    }
}