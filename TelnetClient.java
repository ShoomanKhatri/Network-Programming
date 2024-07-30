import java.io.*;
import java.net.*;
public class TelnetClient {
   public static void main(String[] args) {
      String serverName = "localhost";
      int port = 12345;  
      try {
         // Connect to the Telnet server
         Socket socket = new Socket(serverName, port);  
         // Create input and output streams
         InputStream in = socket.getInputStream();
         OutputStream out = socket.getOutputStream();
         // Send Telnet commands
         out.write("ls\n".getBytes());
         // Read the server response
         BufferedReader reader = new BufferedReader(new InputStreamReader(in));
         String line;
         while ((line = reader.readLine()) != null) {
            System.out.println(line);
         }         // Close the socket and streams
         socket.close();
         in.close();
         out.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
