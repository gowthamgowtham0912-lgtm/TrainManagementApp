import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Define a Bogie class with name and capacity
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with their capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 48));

        // Display before sorting
        System.out.println("Passenger bogies before sorting: " + passengerBogies);

        // Sort bogies by capacity ascending
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("Passenger bogies after sorting by capacity: " + passengerBogies);
    }
}