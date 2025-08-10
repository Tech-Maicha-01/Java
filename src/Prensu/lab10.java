import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter number of rows for Matrix A: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int n = sc.nextInt();

        // Input dimensions for the second matrix
        System.out.print("Enter number of rows for Matrix B: ");
        int p = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int q = sc.nextInt();

        // Check if multiplication is possible (n == p)
        if (n != p) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal rows of B.");
            sc.close();
            return;
        }

        int[][] A = new int[m][n];
        int[][] B = new int[p][q];
        int[][] product = new int[m][q];

        // Input elements for Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Input elements for Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication logic
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output result
        System.out.println("Product of the matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
