// import java.net.URL;
// import java.net.HttpURLConnection;
// import java.io.InputStream;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// public class URLDemo {
//     public static void main(String[] args) {
//         try {
//             // Create a new URL object
//             URL url = new URL("https://www.example.com");
//             // Open a connection to the URL
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//             // Set request properties
//             connection.setRequestMethod("GET");
//             connection.setRequestProperty("User-Agent", "Mozilla/5.0");
//             connection.setConnectTimeout(5000);
//             // Connect to the URL
//             connection.connect();
//             // Read data from the URL
//             InputStream in = connection.getInputStream();
//             BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);
//             }
//             in.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }



//  for title only

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URLDemo {
    public static void main(String[] args) {
        try {
            // Create a new URL object
            URL url = new URL("https://www.example.com");
            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // Set request properties
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            connection.setConnectTimeout(5000);
            // Connect to the URL
            connection.connect();
            // Read data from the URL
            InputStream in = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            String title = null;

            while ((line = reader.readLine()) != null) {
                // Look for the title tag
                if (line.toLowerCase().contains("<title>")) {
                    title = line.substring(line.indexOf("<title>") + 7, line.indexOf("</title>"));
                    break;
                }
            }

            if (title != null) {
                System.out.println("Page Title: " + title);
            } else {
                System.out.println("Title not found.");
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
