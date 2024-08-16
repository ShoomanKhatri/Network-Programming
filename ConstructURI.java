import java.net.URI;

public class ConstructURI {
    public static void main(String[] args) {
        try {
            // Choose a scheme
            String scheme = "http";
            // Identify the domain and path separately
            String domain = "www.example.com";
            String path = "/example.html";
            // Construct the URI
            URI uri = new URI(scheme, domain, path, null);
            // Ensure uniqueness (optional)
            String uniqueURI = uri.toString() + "?timestamp=" + System.currentTimeMillis();
            // Print the URI
            System.out.println("URI: " + uniqueURI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
