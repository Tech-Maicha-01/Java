import java.io.*;
import java.util.Scanner;

public class lab15 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Take employee details from user
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        // Prepare employee data line
        String employeeData = empId + "," + name + "," + address + "," + dob + "," + phone + "\n";

        // Write to file (append mode)
        FileWriter fw = new FileWriter("Emp.txt", true);
        fw.write(employeeData);
        fw.close();

        System.out.println("\nData written to Emp.txt successfully.");

        // Read and display contents of Emp.txt
        System.out.println("\n--- Contents of Emp.txt ---");
        BufferedReader br = new BufferedReader(new FileReader("Emp.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 5) {
                System.out.println("ID: " + parts[0] + ", Name: " + parts[1] + ", Address: " + parts[2]
                        + ", DOB: " + parts[3] + ", Phone: " + parts[4]);
            }
        }

        br.close();
        sc.close();
    }
}
