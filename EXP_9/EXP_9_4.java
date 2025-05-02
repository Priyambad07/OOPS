package EXP_9;

import java.util.Arrays;
import java.util.HashSet;

public class EXP_9_4 {

    public static void main(String[] args) {
        String[] nameArray = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> nameSet = new HashSet<>(Arrays.asList(nameArray));

        String searchName = "Aman";
        System.out.println("Is " + searchName + " in set? " + nameSet.contains(searchName));

        System.out.println("Unique Names:");
        for (String name : nameSet) {
            System.out.println(name);
        }
    }
}
