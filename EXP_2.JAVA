

public class EXP_2{
    // static void Area(int x, int y){
    //     int a = x*y;
    //     System.out.println("The area of RECTANGLE is: " +a);
    // }
    // static void Area(int x){
    //     int a = x*x;
    //     System.out.println("The area of SQUARE is: " +a);
    // }
    // static void Area(int x){
    //     int a = x*x;
    //     System.out.println("The area of TRIANGLE is: " +a);
    // }
    // static void Area(int x){
    //     int a = x*x;
    //     System.out.println("The area of SQUARE is: " +a);
    // }
public static void main(String args[]){
  

//Program 1
//   1.	Print this Pattern:
//*****
//****
//***
//**
//*
//CODE-------------------------------------------------------------------------------------
    //  for (int i = 0; i < 5; i++) {
    //        for (int j = 5; j > i; j--) {
    //             System.out.print("*");       
    //         }
    //         System.out.println();
    //     }
    

//Program 2
// 2.	Write a Java program that calculates the electricity bill based on the number of units consumed by a user. The electricity charges are determined as follows:
// •	For consumption between 1 and 100 units, the cost is Rs 5 per unit.
// •	For consumption between 101 and 200 units, the cost is Rs 7 per unit.
// •	For consumption between 201 and 300 units, the cost is Rs 10 per unit.
// •	For consumption exceeding 300 units, the cost is Rs 15 per unit.
//CODE----------------------------------------------------------------------------
// System.out.println("WHAT IS YOUR ENERGY UNIT CONSUMPTION? ");
// Scanner s = new Scanner(System.in);
// int a = s.nextInt();
// if(a>=1 && a<=100){
//     int BILL= a*5;
//     System.out.println("YOUR ELECTRICITY BILL = Rs " +BILL);
// }
// if(a>=101 && a<=200){
//     int BILL= a*7;
//     System.out.println("YOUR ELECTRICITY BILL = Rs " +BILL);
// }
// if(a>=201 && a<=300){
//     int BILL= a*10;
//     System.out.println("YOUR ELECTRICITY BILL = Rs " +BILL);
// }
// if(a>300){
//     int BILL= a*15;
//     System.out.println("YOUR ELECTRICITY BILL = Rs " +BILL);
// }



//Program 3
// 3.	Write a program to find the area of a shape (Rectangle, Square, Circle, Triangle) using method overloading
//CODE----------------------------------------------------------------------------------------------------------
// Scanner s = new Scanner(System.in);
// Shape[] = s.next(pattern);




//Program 4
// 4.	Write a Java program that takes an operator (+, -, *, /, %) and
//      two numbers as input from the user. Use a switch statement to
//      perform the specified operation and display the result.
//CODE----------------------------------------------------------------------------------------------------------
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter first number:");
//         double a = scanner.nextDouble();
        
//         System.out.println("Enter an operator (+, -, *, /, %):");
//         char operator = scanner.next().charAt(0);
        
//         System.out.println("Enter second number:");
//         double b = scanner.nextDouble();
        
//         double result;
        
//         // Performing the operation using switch statement
//         switch(operator) {
//             case '+':
//                 result = a + b;
//                 System.out.println("Result: " + result);
//                 break;
//             case '-':
//                 result = a - b;
//                 System.out.println("Result: " + result);
//                 break;
//             case '*':
//                 result = a*b ;
//                 System.out.println("Result: " + result);
//                 break;
//             case '/':
//                 if (b != 0) {
//                     result = a / b;
//                     System.out.println("Result: " + result);
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 }
//                 break;
//             case '%':
//                 if (b != 0) {
//                     result = a % b;
//                     System.out.println("Result: " + result);
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 }
//                 break;
//             default:
//                 System.out.println("Error: Invalid operator.");
//         }
}
} 
