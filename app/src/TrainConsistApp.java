import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with their capacities
        bogieCapacity.put("Sleeper", 72);      // 72 seats
        bogieCapacity.put("AC Chair", 60);     // 60 seats
        bogieCapacity.put("First Class", 48);  // 48 seats

        // Iterate and display each bogie with its capacity
        System.out.println("Bogie capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }
    }
}