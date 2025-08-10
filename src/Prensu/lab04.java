import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number; // Keep original number for output

        // Loop to find sum of digits
        while (number != 0) {
            int digit = number % 10;  // Get last digit
            sum += digit;             // Add to sum
            number /= 10;             // Remove last digit
        }

        // Display the result
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}
