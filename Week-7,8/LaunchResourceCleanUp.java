import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LaunchResourceCleanUp {
    public static void main(String[] args) {
        String filePath = "txts/resourcecleanup.txt"; // Change this to your file path
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            // Ensure the file is closed
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
