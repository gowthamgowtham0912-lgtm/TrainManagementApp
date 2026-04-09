import java.util.*;
import java.util.stream.Collectors;

// PassengerBogie class
class PassengerBogie {
    private String type;  // e.g., Sleeper, AC Chair, First Class
    private int capacity; // Number of seats

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie with capacity " + capacity;
    }
}

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        // Prepare a list of passenger bogies
        List<PassengerBogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new PassengerBogie("Sleeper", 72));
        passengerBogies.add(new PassengerBogie("AC Chair", 60));
        passengerBogies.add(new PassengerBogie("First Class", 80));
        passengerBogies.add(new PassengerBogie("Sleeper", 65));
        passengerBogies.add(new PassengerBogie("AC Chair", 55));
        passengerBogies.add(new PassengerBogie("First Class", 90));

        System.out.println("All Passenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // -------------------------------
        // Loop-based filtering
        long loopStart = System.nanoTime();
        List<PassengerBogie> loopFiltered = new ArrayList<>();
        for (PassengerBogie b : passengerBogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        System.out.println("\nLoop-based filtered bogies (capacity > 60):");
        loopFiltered.forEach(System.out::println);
        System.out.println("Loop execution time: " + loopTime + " ns");

        // -------------------------------
        // Stream-based filtering
        long streamStart = System.nanoTime();
        List<PassengerBogie> streamFiltered = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        System.out.println("\nStream-based filtered bogies (capacity > 60):");
        streamFiltered.forEach(System.out::println);
        System.out.println("Stream execution time: " + streamTime + " ns");

        // -------------------------------
        // Compare results
        System.out.println("\nDo both methods produce same results? " +
                loopFiltered.equals(streamFiltered));
    }
}