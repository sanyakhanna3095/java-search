import java.util.Scanner;

class FirstAndLastOccurrence {
    // Function to find the first occurrence of the target
    public static int findFirst(int[] arr, int trgt) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == trgt) {
                first = mid;
                // Search on the left side
                right = mid - 1;
            }
            else if (arr[mid] < trgt) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence of the target
    public static int findLast(int[] arr, int trgt) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == trgt) {
                last = mid;
                // Search on the right side
                left = mid + 1;
            }
            else if (arr[mid] < trgt) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size and array elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking user input for the target value
        System.out.print("Enter the target value: ");
        int trgt = sc.nextInt();

        //making a call to functions to find the first and last occurrence
        int first = findFirst(arr, trgt);
        int last = findLast(arr, trgt);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
