
public class EXP_3{
    public static void main(String[] args) {

//Program 1
//1) Given an integer array nums of size n, find the maximum and minimum elements in the array and return them as a pair.
// Example:
// Input: nums = [1, 5, 7, 2, 9, 3]
// Output: [9, 1]
//CODE-------------------------------------------------------------------------------------------------------------------
// Scanner s= new Scanner(System.in);
// System.out.println("ENTER THE SIZE OF ARRAY");
// int size = s.nextInt();
// int[] Arr = new int[size];
// System.out.println("Enter the elements of array:");
// for (int i = 0; i < size; i++) {
//     Arr[i] = s.nextInt();
// }
// int max= Arr[0], min= Arr[0];
// for (int i = 1; i < size; i++) {
// if (Arr[i] < min) {
//     min = Arr[i];
//     }
// if (Arr[i] > max) {
//     max = Arr[i];
//     }
    
// }
// System.out.println("MAXIMUM AND MINUMUM IS: "+max +"," +min);


//Program 2
// 2) Given an array  of size n, return the majority element.

// The majority element is the element that appears more than 
// ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
//CODE-----------------------------------------------------------------------------------
//     Scanner s = new Scanner(System.in);
//     System.out.println("ENTER THE SIZE OF ARRAY");
//     int Size = s.nextInt();
//     int[] Arr = new int[Size];
//     System.out.println("Enter the elements");
//     for (int i = 0; i < Size; i++) {
//     Arr[i]= s.nextInt();
//         }
// int candidate = Arr[0], count = 0;

//         // Boyer-Moore Voting Algorithm
//         for (int n : Arr) {
//             if (count == 0) {
//                 candidate = n; // Change candidate
//             }
//             count += (n == candidate) ? 1 : -1;
//         }
// System.out.println("Majority element is :"+candidate);

//Program 3
// 3) Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Example:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
//CODE----------------------------------------------------------------------------------------------------------------
    // Scanner s = new Scanner(System.in);
    // System.out.println("ENTER THE SIZE OF ARRAY");
    // int Size = s.nextInt();
    // int[] Arr = new int[Size];
    // System.out.println("Enter the elements");
    // for (int i = 0; i < Size; i++) {
    // Arr[i]= s.nextInt();
    //     }
    // int index = 0; 

    //     // Move all non-zero elements forward
    //     for (int num : Arr) {
    //         if (num != 0) {
    //             Arr[index++] = num;
    //         }
    //     }
    //     // Fill the rest with zeros
    //     while (index < Arr.length) {
    //         Arr[index++] = 0;
    //     }
    // System.out.println("Modified Array: ");
    // for (int i = 0; i < Size; i++) {
    //     System.out.print(" "+Arr[i]);
        
    // }

    //Program 4
//4) Given a string s, reverse the words of the string.
// Example 1:
// Input: s=”This is decent”
// Output: “decent is This”
//CODE---------------------------------------------------------------------------------------
// Scanner s = new Scanner(System.in);

//         // Taking string input
//         System.out.print("Enter a sentence: ");
//         String input = s.nextLine();

    
//         String[] words = input.trim().split("\\s+");
//         StringBuilder result = new StringBuilder();

//         for (int i = words.length - 1; i >= 0; i--) {
//             result.append(words[i]).append(" ");
//         }

//         // Printing the reversed words
//         System.out.println("Reversed Words: " + result.toString().trim());


    }
 }
