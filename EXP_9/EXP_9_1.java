package EXP_9;

import java.util.ArrayList;
public class EXP_9_1 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);

        System.out.println("Prime Check:");
        for (int num : numbers) {
            System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
        }
    }
}

