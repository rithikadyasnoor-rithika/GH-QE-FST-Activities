package activities;

public class Activity1 {

    public static void main(String[] args) {
        // Create an object of the Car class
        Car toyota = new Car();

        // Initialize values
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        // Using Car class methods
        toyota.displayCharacteristics();
        toyota.accelerate();
        toyota.brake();
    }
}
