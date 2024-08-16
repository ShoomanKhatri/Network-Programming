import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);
        byte[] buffer = new byte[1024];

        System.out.println("UDP server started...");

        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + message);

            String response = "Hello from the UDP server!";
            socket.send(new DatagramPacket(response.getBytes(), response.length(), packet.getAddress(), packet.getPort()));
        }
    }
}
