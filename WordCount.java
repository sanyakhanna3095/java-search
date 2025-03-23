import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the filename from the user
        System.out.print("Enter the filename: ");
        String fileName = sc.nextLine();

        // Get the word to search from the user
        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();

        int wordCount = 0;

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading file contents...");

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Remove punctuation and convert to lowercase for better matching
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                // Split line into words and check occurrences
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(searchWord.toLowerCase())) {
                        wordCount++;
                    }
                }
            }

            // Close resources
            br.close();
            fr.close();

            // Display the result
            System.out.println("\nThe word '" + searchWord + "' appears " + wordCount + " times in the file.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
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
