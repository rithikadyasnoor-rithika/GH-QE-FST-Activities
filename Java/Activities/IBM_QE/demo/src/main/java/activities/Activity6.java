package activities;

import java.time.LocalDateTime;

public class Activity6 {
    public static void main(String[] args) {
        try {
            // Create plane with max capacity 10
            Plane plane = new Plane(10);

            // Onboard some passengers
            plane.onboard("Alice");
            plane.onboard("Bob");
            plane.onboard("Charlie");
            plane.onboard("Diana");

            // Take-off time
            LocalDateTime takeOffTime = plane.takeOff();
            System.out.println("Plane took off at: " + takeOffTime);

            // Print passengers currently onboard
            System.out.println("Passengers onboard: " + plane.getPassengers());

            // Simulate flight time (5 seconds)
            Thread.sleep(5000);

            // Land plane and print landing time
            plane.land();
            System.out.println("Plane landed at: " + plane.getLastTimeLanded());

            // Passengers should be cleared after landing
            System.out.println("Passengers after landing: " + plane.getPassengers());

        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            System.err.println("Sleep was interrupted.");
        } catch (IllegalArgumentException | IllegalStateException ex) {
            // Basic validation/flow errors
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
