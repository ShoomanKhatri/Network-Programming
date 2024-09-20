import java.io.*;
import java.net.*;
import java.util.Base64;

public class DownloadProtectedPage {
    public static void main(String[] args) throws Exception {
        String webUrl = "https://example.com/protected-page";
        String username = "yourUsername";
        String password = "yourPassword";

        URL url = new URL(webUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String auth = username + ":" + password;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
        connection.setRequestProperty("Authorization", "Basic " + encodedAuth);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             BufferedWriter out = new BufferedWriter(new FileWriter("downloaded_page.html"))) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
        }

        System.out.println("Page downloaded successfully.");
    }
}
