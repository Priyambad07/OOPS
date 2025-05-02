package EXP_6;
import java.util.Scanner;
import Ecommerce.Product; // Importing the Product class

public class Program4{
    static String name;
    static double price;
    static int stock;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide the details of product:");
        System.out.println("Provide the Name of product:");
        String name = s.nextLine();
        System.out.println("Provide the Price of product:");
        double price = s.nextDouble();
        System.out.println("Provide the stock of product:");
        int stock = s.nextInt();
        Product product = new Product(name, price, stock);

        // Public method - Accessible
        product.getProductDetails();

        // Protected method - NOT accessible because it's not in the same package & no subclassing
        // product.applyDiscount(10);

        // Default-access method - NOT accessible because it's in a different package
        // product.updateStock(20);

        // Private method - NOT accessible at all, even within the same class
        // product.calculateProfit();

        // Indirectly accessing private method via public method
        product.showProfitCalculation();
    }
}
