import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object in the registry
            Hello obj = (Hello) Naming.lookup("rmi://localhost/Hello");

            // Call the sayHello() method and print the result
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
