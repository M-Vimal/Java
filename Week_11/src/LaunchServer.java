import java.net.*;
import java.io.*;

public class LaunchServer {
    private static String filepath = "TextFiles/sender.txt";
    private static int buffer_size = 4096;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1701)) {
            System.out.println("Server is waiting for a connection...");
            
            try (Socket socket = serverSocket.accept();
                 FileInputStream fis = new FileInputStream(filepath);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 OutputStream os = socket.getOutputStream()) {

                System.out.println("Client connected. Sending file...");

                byte[] buffer = new byte[buffer_size];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
                os.flush();  // Ensure all data is sent before closing
                
                System.out.println("File sent successfully.");
            } catch (IOException e) {
                System.err.println("Error in server: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        }
    }
}
