import java.io.*;
import java.net.*;

public class TelnetServer {
    public static void main(String[] args) {
        int port = 12345; // Use a port number above 1024
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Telnet server started on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(inputLine)) {
                            out.println("Goodbye!");
                            break;
                        }
                        out.println("Received: " + inputLine);
                    }
                } catch (IOException e) {
                    System.out.println("Client connection error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
