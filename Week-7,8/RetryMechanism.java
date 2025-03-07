import java.util.Scanner;

// Custom Exception
class ConnectionFailedException extends Exception {
    public ConnectionFailedException(String msg) {
        super(msg);
    }
}

// Server class
class Server {
    public String acceptRequest(int val) throws ConnectionFailedException {
        if (val == 0) { // Simulating a failed connection
            throw new ConnectionFailedException("Connection Failed");
        }
        return "success";
    }
}

// Main class
public class RetryMechanism {
    public static void main(String[] args) {
        Server server = new Server();
        Scanner scanner = new Scanner(System.in);
        
        int val = scanner.nextInt();
        scanner.close();

        int retries = 3;
        while (retries > 0) {
            try {
                String response = server.acceptRequest(val);
                System.out.println("Server Response: " + response);
                return; // Exit after success
            } catch (ConnectionFailedException e) {
                System.out.println("Attempt failed: " + e.getMessage());
                retries--;
                if (retries == 0) {
                    System.out.println("Max retries reached. Exiting.");
                } else {
                    System.out.println("Retrying... (" + retries + " attempts left)");
                }
            }
        }
    }
}
