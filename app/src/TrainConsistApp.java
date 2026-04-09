import java.util.*;
import java.util.stream.*;

// GoodsBogie class
class GoodsBogie {
    private String type;  // e.g., Cylindrical, Rectangular, Box
    private String cargo; // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        // Prepare list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Uncomment next line to test violation
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display all goods bogies
        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        // ✅ UC12: Safety Compliance Check
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.getType().equals("Cylindrical") || b.getCargo().equals("Petroleum"));

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT");
        } else {
            System.out.println("\nTrain is NOT SAFE! Violation found.");
        }
    }
}