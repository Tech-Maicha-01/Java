import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double product = num1 * num2;
        double quotient =  num1 / num2; // Handle division by zero
        double remainder = num1 % num2; 
        double average = (num1 + num2) / 2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
