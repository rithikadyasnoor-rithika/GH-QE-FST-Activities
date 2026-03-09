package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {

        // Create Map with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 random colours
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Yellow");
        colours.put(4, "Pink");
        colours.put(5, "Black");

        // Print the map
        System.out.println("Colours Map: " + colours);

        // Remove one colour
        System.out.println("Removing key 3: " + colours.remove(3));

        // Check if green exists
        System.out.println("Does the map contain 'Green'? " + colours.containsValue("Green"));

        // Print size of map
        System.out.println("Size of the Map: " + colours.size());
    }
}