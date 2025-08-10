import java.io.*;
import java.util.Scanner;

public class lab16 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        String age = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        // Format the student record
        String studentData = name + "," + age + "," + grade + "," + contact + "\n";

        // Step 2: Write to std.txt
        FileWriter fw = new FileWriter("std.txt");
        fw.write(studentData);
        fw.close();

        // Step 3: Copy std.txt to std1.txt
        BufferedReader reader = new BufferedReader(new FileReader("std.txt"));
        FileWriter writer = new FileWriter("std1.txt");

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
        }

        reader.close();
        writer.close();

        // Step 4: Display contents of std1.txt
        BufferedReader display = new BufferedReader(new FileReader("std1.txt"));
        System.out.println("\n--- Contents of std1.txt ---");

        while ((line = display.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                System.out.println("Name: " + parts[0] + ", Age: " + parts[1] + ", Grade: " + parts[2] + ", Contact: " + parts[3]);
            }
        }

        display.close();
        sc.close();
    }
}
