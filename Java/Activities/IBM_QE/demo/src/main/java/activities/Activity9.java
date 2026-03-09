package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        // Declaring ArrayList of String objects
        ArrayList<String> myList = new ArrayList<String>();

        // Adding objects to ArrayList at default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");

        // Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Papaya");

        System.out.println("Print All the Objects:");
        for (String s : myList) {
            System.out.println(s);
        }

        // Retrieve the 3rd element (index 2)
        System.out.println("3rd element in the list is: " + myList.get(2));

        // Check if a name exists
        System.out.println("Is Chicku in list: " + myList.contains("Chicku"));

        // Print current size
        System.out.println("Size of ArrayList: " + myList.size());

        // Remove an item and print new size
        myList.remove("Papaya");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}

