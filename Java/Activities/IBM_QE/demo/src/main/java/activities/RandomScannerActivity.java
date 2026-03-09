package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String[] args) {
        // Create required objects
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integers (type any non-integer like 'q' to stop):");

        // Use hasNextInt() to accept only integers in a loop
        while (scan.hasNextInt()) {
            int value = scan.nextInt();
            list.add(value);
        }

        // We are done reading input; close the scanner
        scan.close();

        // Convert ArrayList to array as specified
        Integer nums[] = list.toArray(new Integer[0]);

        // Handle the case where the list is empty
        if (nums.length == 0) {
            System.out.println("No integers were entered. Exiting.");
            return;
        }

        // Generate a random index within bounds [0, nums.length)
        int randomIndex = indexGen.nextInt(nums.length);

        // Print the generated index and the value at that index
        System.out.println("Generated index: " + randomIndex);
        System.out.println("Value at that index: " + nums[randomIndex]);
    }
}