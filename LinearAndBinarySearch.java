import java.util.Arrays;
import java.util.Scanner;

class LinearAndBinarySearch {
    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }

    // Function to perform Binary Search to find the index of a target number
    public static int binarySearch(int[] arr, int trgt) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == trgt) {
                return mid;
            }
            else if (arr[mid] < trgt) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding the first missing positive integer
        int missing = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        // Sorting the array for Binary Search
        Arrays.sort(arr);

        // Taking user input for the target value
        System.out.print("Enter the target value to search: ");
        int trgt = sc.nextInt();

        // Finding the index of the target using Binary Search
        int index = binarySearch(arr, trgt);
        System.out.println("Index of target value: " + index);
    }
}
