import java.net.URI;
import java.net.URISyntaxException;
public class ResolveURI {
    public static void main(String[] args) {
        try {
            // Define the base URI
            URI baseURI = new URI("http://www.example.com/path/to/document.html");
            // Define the relative URI
            URI relativeURI = new URI("../images/image.jpg");
            // Resolve the relative URI against the base URI
            URI absoluteURI = baseURI.resolve(relativeURI);
            // Print the resulting absolute URI
            System.out.println("Resolved URI: " + absoluteURI);
        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}
