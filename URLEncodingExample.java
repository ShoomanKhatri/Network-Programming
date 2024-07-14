import java.net.URLEncoder;
public class URLEncodingExample {
    public static void main(String[] args) throws Exception {
        String originalString = "http://www.example.com/search?q=java tutorial";
        String encodedString = URLEncoder.encode(originalString, "UTF-8");
        System.out.println("Encoded string: " + encodedString);
    }
}
