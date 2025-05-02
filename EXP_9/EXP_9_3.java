package EXP_9;

import java.util.HashMap;
import java.util.Map;

public class EXP_9_3 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        // Update product 102
        inventory.put(102, 45);

        // Remove product 103
        inventory.remove(103);

        System.out.println("Final Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}

