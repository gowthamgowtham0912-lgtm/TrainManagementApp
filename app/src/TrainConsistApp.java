import java.util.LinkedList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Train consist after adding bogies: " + trainConsist);

        // Insert Pantry Car at position 2 (0-based indexing)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        // Remove first and last bogie
        String removedFirst = trainConsist.removeFirst();
        String removedLast = trainConsist.removeLast();
        System.out.println("Removed first bogie: " + removedFirst + ", last bogie: " + removedLast);

        // Display final train consist
        System.out.println("Final ordered train consist: " + trainConsist);
    }
}