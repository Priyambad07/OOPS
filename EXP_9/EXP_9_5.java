package EXP_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class EXP_9_5 {

    public static void main(String[] args) {
        ArrayList<Integer> numsWithDuplicates = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));
        HashSet<Integer> uniqueNums = new HashSet<>(numsWithDuplicates);

        int sum = 0;
        for (int val : uniqueNums) {
            sum += val;
        }

        System.out.println("Sum of unique values: " + sum);
    }
}

