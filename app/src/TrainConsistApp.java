import java.util.ArrayList;
import java.util.List;

// Custom runtime exception for unsafe cargo
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// GoodsBogie class
class GoodsBogie {
    private String shape;   // e.g., Rectangular, Cylindrical
    private String cargo;   // e.g., Coal, Petroleum

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public String getShape() { return shape; }
    public String getCargo() { return cargo; }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            if ("Rectangular".equalsIgnoreCase(shape) && "Petroleum".equalsIgnoreCase(cargo)) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot go into Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo " + cargo + " assigned to " + shape + " bogie successfully.");
        } catch (CargoSafetyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie carrying " + (cargo == null ? "no cargo" : cargo);
    }
}

// Main application class
public class TrainConsistApp {

    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Rectangular"));
        goodsBogies.add(new GoodsBogie("Cylindrical"));
        goodsBogies.add(new GoodsBogie("Rectangular"));

        // Attempt cargo assignments
        goodsBogies.get(0).assignCargo("Petroleum");   // Unsafe
        goodsBogies.get(1).assignCargo("Petroleum");   // Safe
        goodsBogies.get(2).assignCargo("Coal");        // Safe

        // Display final bogie states
        System.out.println("Final Goods Bogies:");
        goodsBogies.forEach(System.out::println);
    }
}