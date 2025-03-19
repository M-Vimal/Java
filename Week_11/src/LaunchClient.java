import java.net.*;
import java.io.*;

public class LaunchClient {
    private static String resultfile = "TextFiles/receiver.txt";
    private static int buffer_size = 4096;

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1701);
             InputStream is = socket.getInputStream();
             BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(resultfile))) {

            System.out.println("Connected to server. Receiving file...");

            byte[] buffer = new byte[buffer_size];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            fileOutputStream.flush(); // Ensure all data is written
            System.out.println("File received successfully.");

        } catch (IOException e) {
            System.err.println("Error in client: " + e.getMessage());
        }
    }
}
