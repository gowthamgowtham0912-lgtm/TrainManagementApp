import java.util.Scanner;

public class TrainManagementApp {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true; // match found → stop early
            }
        }
        return false; // no match found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = searchBogie(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found in the consist.");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        scanner.close();
    }
}
