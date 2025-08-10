import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Read array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Add each element to sum
        }

        // Display the result
        System.out.println("Sum of array elements: " + sum);

        scanner.close();
    }
}
