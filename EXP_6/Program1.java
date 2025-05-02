package EXP_6;
//1) In a taxation system, businesses need to calculate the tax applied to their invoices while ensuring the tax rate remains unchanged. Create a class TaxCalculator that defines a final variable GST_RATE, set to 18.0%, which cannot be modified. Additionally, define a final method displayGST() that prints the tax rate. Create another class Invoice that extends TaxCalculator and includes a method calculateTotalWithTax(double amount), which computes the total amount after applying GST_RATE. In the main() method, test the calculateTotalWithTax() method and observe what happens if you attempt to modify GST_RATE or override displayGST(). This exercise will highlight how the final keyword ensures that tax rates remain constant across all calculations.
// Parent class defining the constant GST rate
class TaxCalculator {
    // Defining a final variable for GST Rate
    final double GST_RATE = 18.0;

    // Final method to display GST rate
    final void displayGST() {
        System.out.println("GST Rate: " + GST_RATE + "%");
    }
}


class Invoice extends TaxCalculator {

    double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }


    // This will cause a compilation error because displayGST() is final in the parent class
//    void displayGST() {
//        System.out.println("Attempting to override GST display method.");
//    }
}

public class Program1{
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.displayGST(); // Displays GST rate

        double amount = 1000.0;
        double totalWithTax = invoice.calculateTotalWithTax(amount);
        System.out.println("Total amount after applying GST: " + totalWithTax);


//        GST_RATE is final and cannot be changed
//        invoice.GST_RATE = 20.0;

    }
}

