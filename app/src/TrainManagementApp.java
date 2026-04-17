import java.util.Scanner;

public class TrainManagementApp {

    // Linear Search with Defensive Check
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Defensive Programming: check state first
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        // Input bogies
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }
        }

        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID NOT found.");
            }

        } catch (IllegalStateException e) {
            // meaningful error message
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}