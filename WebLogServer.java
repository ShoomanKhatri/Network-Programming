import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class WebLogServer {
public static void main(String[] args) throws IOException {
String fileName = "access.log"; // change this to the path of your log file
int portNumber = 1234; // change this to the port number you want to use
try (ServerSocket serverSocket = new ServerSocket(portNumber);
Socket clientSocket = serverSocket.accept(); // wait for a client to connect
BufferedReader br = new BufferedReader(new FileReader(fileName)); // read from the log file
PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) { // send data to client
String line;
while ((line = br.readLine()) != null) { // read each line of the log file
String[] tokens = line.split(" "); // split the line into tokens
String ip = tokens[0]; // get the IP address from the first token
out.println(ip); // send the IP address to the client over the socket connection
}
} catch (IOException e) {
e.printStackTrace();
}
}
}