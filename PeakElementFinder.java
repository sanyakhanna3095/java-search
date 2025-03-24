import java.util.Scanner;

class PeakElementFinder {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2; // Find the middle index

            // If mid element is greater than the next element, the peak must be in the left half
            if (arr[mid] > arr[mid + 1]) {
                // Move the search space to the left half
                right = mid;
            }
            else {
                // Move the search space to the right half
                left = mid + 1;
            }
        }

        // At the end of the loop, left == right, which is the peak index
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array size and elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //making a call to method to find the peak element
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex + " (Value: " + arr[peakIndex] + ")");

    }
}
