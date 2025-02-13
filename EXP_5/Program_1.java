package EXP_5;
//1. Write a Java program to demonstrate that a private member of a superclass cannot be accessed directly from a derived class.
class SuperClass {
    private int privateVar = 10; // Private member

    // Public method to access private member
    public int getPrivateVar() {
        return privateVar;
    }
}

class SubClass extends SuperClass {
    void display() {
        // Uncommenting the below line will cause a compilation error
        // System.out.println("Private Variable: " + privateVar);

        // Accessing private variable using a public method
        System.out.println("Private Variable (accessed via method): " + getPrivateVar());
    }
}
public class Program_1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
