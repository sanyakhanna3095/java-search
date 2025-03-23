import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take user input for string
        System.out.println("Enter input string to reverse: ");
        String s = sc.nextLine();
        //Make a call to method sol to remove duplicates
        String res = sol(s);
        System.out.println("String with unique characters only: " + res);
    }

    // Method to remove duplicate characters while maintaining order
    public static String sol(String s) {
        StringBuilder sb = new StringBuilder();

        //Hashset to keep track of characters already appeared
        HashSet<Character> set = new HashSet<>();

        // Iterate through each character
        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                // Append unique character
                sb.append(ch);

                // Mark character as seen
                set.add(ch);
            }
        }
        return sb.toString();
    }
}


/*
I/P ->
Enter input string to reverse:
Sanya Khanna

O/P->
String with unique characters only: Sany Kh

 */