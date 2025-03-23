import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take user input for string
        System.out.println("Enter input string to reverse: ");
        String s=sc.nextLine();

        String res=reverse(s);
        System.out.println("Reversed string: "+res);
    }

    // Method to reverse a string using StringBuilder
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();

    }
}



/*
I/P ->
Enter input string to reverse:
Hello

O/P->
Reversed string: olleH
 */