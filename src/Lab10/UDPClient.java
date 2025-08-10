package Lab10;

import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        final String SERVER = "localhost";
        final int PORT = 6000;

        try {
            DatagramSocket socket = new DatagramSocket();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String message = sc.nextLine();
            byte[] data = message.getBytes();

            InetAddress serverAddress = InetAddress.getByName(SERVER);
            DatagramPacket request = new DatagramPacket(data, data.length, serverAddress, PORT);
            socket.send(request);

            // Receive response
            byte[] buffer = new byte[1024];
            DatagramPacket response = new DatagramPacket(buffer, buffer.length);
            socket.receive(response);

            String reply = new String(response.getData(), 0, response.getLength());
            System.out.println("Received from server: " + reply);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
