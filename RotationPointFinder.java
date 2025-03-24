import java.util.Scanner;

public class RotationPointFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array size and elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //making a call to method to find the index of the rotation point
        int rotationIndex = findRotationPoint(arr);

        System.out.println("The rotation point (smallest element) is at index: " + rotationIndex);

    }


    // Function to find the rotation point (smallest element) in a rotated sorted array
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element, then the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }

            // Otherwise, the smallest element is in the left half (including mid)
            else {
                right = mid;
            }
        }

        // After the loop, left will be pointing to the smallest element (rotation point)
        return left;
    }
}
