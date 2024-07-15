import java.net.*;
public class ProxyDemo {
  public static void main(String[] args) throws Exception {
    String urlString = "https://www.google.com";
    URL url = new URL(urlString);
    // create a proxy instance with the host and port number
    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
    // open the connection using the proxy
    HttpURLConnection connection = (HttpURLConnection)url.openConnection(proxy);
    // set the request method and other properties
    connection.setRequestMethod("GET");
    connection.setConnectTimeout(5000);
    connection.setReadTimeout(5000);
    // read the response from the server
    int responseCode = connection.getResponseCode();
    System.out.println("Response code: " + responseCode);
    // close the connection
    connection.disconnect();
  }
}
