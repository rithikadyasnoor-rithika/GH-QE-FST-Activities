package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> hs = new HashSet<String>();

        // Add 6 objects
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Dates");
        hs.add("Fig");
        hs.add("Grapes");

        // Print size of HashSet
        System.out.println("Initial size of HashSet: " + hs.size());

        // Remove an existing element
        System.out.println("Removing 'Banana': " + hs.remove("Banana"));

        // Attempt to remove an item not in the set
        System.out.println("Removing 'Kiwi' (not in set): " + hs.remove("Kiwi"));

        // Check if a value exists
        System.out.println("Does set contain 'Apple'? " + hs.contains("Apple"));
        System.out.println("Does set contain 'Banana'? " + hs.contains("Banana"));

        // Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
