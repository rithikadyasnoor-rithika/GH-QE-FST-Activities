package activities;

public class Car {
    // Class Member Variables
    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    // Constructor initializes tyres and doors to 4
    public Car() {
        this.tyres = 4;
        this.doors = 4;
    }

    // Displays all characteristics
    public void displayCharacteristics() {
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }

    // Prints when accelerating
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    // Prints when braking
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
