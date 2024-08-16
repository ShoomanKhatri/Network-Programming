import java.net.*;
import java.io.*;
import java.util.*;

public class HttpHeaderExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        // Set request method
        connection.setRequestMethod("GET");
        
        // Set request headers
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        
        // Print response code and message
        System.out.println("Response Code: " + connection.getResponseCode());
        System.out.println("Response Message: " + connection.getResponseMessage());
        
        // Print all response headers
        System.out.println("\nResponse Headers:");
        Map<String, List<String>> responseHeaders = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Print request headers
        System.out.println("\nRequest Headers:");
        System.out.println("Request Method: " + connection.getRequestMethod());
        System.out.println("Request URL: " + connection.getURL());
        System.out.println("User-Agent: " + connection.getRequestProperty("User-Agent"));
        System.out.println("Accept-Language: " + connection.getRequestProperty("Accept-Language"));
        
        // Close connection
        connection.disconnect();
    }
}
