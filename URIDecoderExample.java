import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public class URIDecoderExample {
    public static void main(String[] args) {
        try {
            String encodedURI = "https://example.com/search?q=hello%20world";
            String decodedURI = URLDecoder.decode(encodedURI, StandardCharsets.UTF_8);
            System.out.println(decodedURI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
