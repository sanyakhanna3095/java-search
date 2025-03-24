import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of sentences and sentences itself
        System.out.print("Enter the number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter " + n + " sentences:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Take user input for the word to search
        System.out.print("Enter the word to search for: ");
        String s = sc.next();

        // Call function to find the first sentence containing the word
        String result = findSentenceWithWord(arr, s);

        System.out.println("Result: " + result);

    }

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                // Return the first sentence containing the word
                return sentence;
            }
        }
        // Return if no sentence contains the word
        return "Not Found";
    }
}


/*
I/P->
Enter the number of sentences: 3
Enter 3 sentences:
Hello Colleagues!
I am Sanya Khanna
Welcome to College

O/P->
Enter the word to search for: am
Result: I am Sanya Khanna
 */