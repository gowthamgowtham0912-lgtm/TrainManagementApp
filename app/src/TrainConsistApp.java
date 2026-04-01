import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate
        bogieIDs.add("BG104");

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs in the train consist: " + bogieIDs);

        // Optional: demonstrate that adding a duplicate returns false
        boolean added = bogieIDs.add("BG101"); // already exists
        System.out.println("Attempted to add BG101 again: " + (added ? "Added" : "Ignored, already exists"));
    }
}