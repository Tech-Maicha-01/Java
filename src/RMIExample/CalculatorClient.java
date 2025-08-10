package RMIExample;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator calc = (Calculator) registry.lookup("CalcService");

            int a = 10, b = 5;
            System.out.println("Sum of " + a + " and " + b + " = " + calc.sum(a, b));
            System.out.println("Difference of " + a + " and " + b + " = " + calc.difference(a, b));
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
