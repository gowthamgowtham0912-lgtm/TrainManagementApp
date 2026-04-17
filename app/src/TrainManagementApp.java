import java.util.Scanner;

public class TrainManagementApp {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            // flag to optimize if already sorted
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // if no swaps → already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to display array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method (User interaction)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = scanner.nextInt();

        int[] capacities = new int[n];

        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        System.out.println("Before Sorting:");
        display(capacities);

        bubbleSort(capacities);

        System.out.println("After Sorting:");
        display(capacities);

        scanner.close();
    }
}