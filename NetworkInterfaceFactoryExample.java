import java.net.*;
public class NetworkInterfaceFactoryExample {
public static void main(String[] args) throws SocketException, UnknownHostException {
InetAddress address = InetAddress.getByName("192.168.1.100");  //for codespace 127.0.0.1 for testing
NetworkInterface iface = NetworkInterface.getByInetAddress(address);
if (iface == null) {
System.out.println("No interface found for address: " + address.getHostAddress());
} else {
System.out.println("Interface found: " + iface.getName());
}
}
}