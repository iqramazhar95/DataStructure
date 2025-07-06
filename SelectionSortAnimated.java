import java.util.Arrays;

public class SelectionSortAnimated {
    public static void main(String[] args) {
        // Step 1: Define an unsorted array
        int[] arr = {5, 2, 8, 6, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Step 2: Call the selection sort method
        selectionSort(arr);

        // Step 8: Final sorted array
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }

    // Step 3: Define the selection sort method
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Step 4: Loop through each position in the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index i is the smallest

            // Step 5: Find the smallest value in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller value is found
                }
            }

            // Step 6: Swap the found minimum with the current position
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            // Step 7: Print array after each outer loop pass (animation)
            System.out.print("Step " + (i + 1) + ": ");
            printArrayWithHighlight(arr, i + 1);  // animate current sorted part
        }
    }

    // Animation helper: Print array showing sorted and unsorted parts
    public static void printArrayWithHighlight(int[] arr, int sortedUpto) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < sortedUpto) {
                // ✅ Already sorted
                System.out.print("(" + arr[i] + ")");
            } else {
                // 🔄 Still unsorted
                System.out.print(arr[i]);
            }
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
