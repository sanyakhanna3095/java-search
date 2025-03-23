import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        // Take input for each string
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Call method to concatenate strings
        String result = sol(arr);

        // Print the concatenated result
        System.out.println("Concatenated String: " + result);
    }

    // Method to concatenate strings efficiently using StringBuffer
    public static String sol(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            // Append each string
            sb.append(str);
        }

        // Convert to string and return
        return sb.toString();
    }
}


/*
I/P->
Enter the number of strings: 3
Enter 3 strings:
Hello
Capgemini
Colleagues

O/P->
Concatenated String: HelloCapgeminiColleagues
 */