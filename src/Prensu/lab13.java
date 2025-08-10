import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take input from user
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.print("Enter array index (0 to 2): ");
            int index = sc.nextInt();

            int[] arr = {10, 20, 30};

            // Possible exceptions:
            int result = a / b;               // May throw ArithmeticException
            System.out.println("Result: " + result);

            System.out.println("Array value: " + arr[index]); // May throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Multi-catch block
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Always runs
            System.out.println("Finally block executed. Cleaning up resources...");
            sc.close();
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
