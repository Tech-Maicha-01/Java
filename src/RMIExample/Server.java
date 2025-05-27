// File: Server.java

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();
            Registry registry = LocateRegistry.getRegistry();

            registry.rebind("HelloService", obj);

            System.out.println("RMI Server is ready...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
