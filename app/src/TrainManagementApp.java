import java.util.Arrays;
import java.util.Scanner;

public class TrainManagementApp {

    // Method to sort bogie names
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies); // built-in sorting
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogies = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogies[i] = scanner.nextLine();
        }

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogies));

        scanner.close();
    }
}
