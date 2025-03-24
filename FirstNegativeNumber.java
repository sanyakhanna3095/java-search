import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Take user input for number of elements and the elements
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Make a call to method sol to find first negative number
        int idx=sol(arr);

        System.out.println(idx);
    }

    //Method to find the first negative number
    public static int sol(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
}


/*
I/P ->
Enter size of array:
5

Enter 5 numbers:
0
23
43
-2
-4

O/P->
3
 */