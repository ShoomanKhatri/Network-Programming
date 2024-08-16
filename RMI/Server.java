import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            // Create and export a remote object
            HelloImpl obj = new HelloImpl();

            // Bind the remote object to the name "Hello" in the already running registry
            Naming.rebind("rmi://localhost/Hello", obj);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
