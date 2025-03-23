import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for filename
        System.out.print("Enter the filename to read: ");
        String fileName = sc.nextLine();

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nFile Contents:");
            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            fr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            // Close scanner
            sc.close();
        }
    }
}
