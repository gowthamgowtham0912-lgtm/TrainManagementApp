import java.util.List;
import java.util.ArrayList;

// Custom exception for invalid bogie capacity
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// PassengerBogie class with capacity validation
class PassengerBogie {
    private String type;  // e.g., Sleeper, AC Chair, First Class
    private int capacity; // Number of seats

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return type + " Bogie with capacity " + capacity;
    }
}

// Main application class
public class TrainConsistApp {

    public static void main(String[] args) {

        List<PassengerBogie> passengerBogies = new ArrayList<>();

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            passengerBogies.add(b1);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0); // Invalid
            passengerBogies.add(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            PassengerBogie b3 = new PassengerBogie("First Class", -10); // Invalid
            passengerBogies.add(b3);
        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            PassengerBogie b4 = new PassengerBogie("AC Chair", 60); // Valid
            passengerBogies.add(b4);
        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nSuccessfully created passenger bogies:");
        passengerBogies.forEach(System.out::println);
    }
}