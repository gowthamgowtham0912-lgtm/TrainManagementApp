import java.util.Arrays;
import java.util.Scanner;

public class TrainManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true; // found
            } else if (result < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter sorted bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        // Ensure sorting (important step)
        Arrays.sort(bogieIds);

        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found using Binary Search.");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        scanner.close();
    }
}