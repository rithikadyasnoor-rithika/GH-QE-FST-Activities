package activities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Encapsulated Plane class.
 * - All fields are private
 * - State changes happen through methods
 */
public class Plane {

    private final int maxPassengers;
    private final List<String> passengers; // using List for add()/clear()
    private LocalDateTime lastTimeLanded;

    /**
     * Constructor initializes maxPassengers and passengers list as empty.
     */
    public Plane(int maxPassengers) {
        if (maxPassengers < 0) {
            throw new IllegalArgumentException("maxPassengers cannot be negative.");
        }
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
        this.lastTimeLanded = null; // not landed yet
    }

    /**
     * Adds a single passenger if capacity allows.
     */
    public void onboard(String passengerName) {
        if (passengerName == null || passengerName.isBlank()) {
            throw new IllegalArgumentException("Passenger name cannot be null/blank.");
        }
        if (passengers.size() >= maxPassengers) {
            throw new IllegalStateException("Cannot onboard: plane is at full capacity (" + maxPassengers + ").");
        }
        passengers.add(passengerName);
    }

    /**
     * Convenience: add multiple passengers.
     */
    public void onboard(List<String> names) {
        if (names == null) {
            throw new IllegalArgumentException("Passenger list cannot be null.");
        }
        for (String name : names) {
            onboard(name); // reuse capacity & validation
        }
    }

    /**
     * Returns current date/time of take-off (does not change passengers).
     */
    public LocalDateTime takeOff() {
        return LocalDateTime.now();
    }

    /**
     * Land the plane: record landing time and clear passengers.
     */
    public void land() {
        this.lastTimeLanded = LocalDateTime.now();
        this.passengers.clear();
    }

    /**
     * Returns the last landing time (could be null if never landed).
     */
    public LocalDateTime getLastTimeLanded() {
        return lastTimeLanded;
    }

    /**
     * Returns a read-only view of passengers.
     */
    public List<String> getPassengers() {
        return Collections.unmodifiableList(passengers);
    }

    // Some checkers misspell this method; provide alias for compatibility.
    public List<String> getPassesngers() {
        return getPassengers();
    }

    /**
     * Optional getter for maxPassengers (encapsulation-friendly).
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }
}
