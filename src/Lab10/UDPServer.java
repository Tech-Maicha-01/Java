package Lab10;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        final int PORT = 6000;

        try {
            DatagramSocket socket = new DatagramSocket(PORT);
            System.out.println("UDP Server is running...");

            byte[] buffer = new byte[1024];

            // Receive packet
            DatagramPacket request = new DatagramPacket(buffer, buffer.length);
            socket.receive(request);
            String received = new String(request.getData(), 0, request.getLength());
            System.out.println("Received from client: " + received);

            // Send response
            String reply = "Hello, " + received;
            byte[] sendData = reply.getBytes();

            InetAddress clientAddress = request.getAddress();
            int clientPort = request.getPort();
            DatagramPacket response = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            socket.send(response);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
