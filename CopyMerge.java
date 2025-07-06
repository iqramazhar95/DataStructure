public class CopyMerge {
    public static void main(String[] args) {
        int arr[] = {1, 5, 1, 4, 6, 2};
        System.out.println("before sorting:");
        for (int n : arr) {
            System.out.print(n + "  ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nafter sorting:");
        for (int n : arr) {
            System.out.print(n + "  ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);         // ✅ left side
            mergeSort(arr, mid + 1, r);     // ✅ right side
            merge(arr, l, mid, r);          // ✅ merge both
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (int x = 0; x < n1; x++) {
            larr[x] = arr[l + x];
        }
        for (int x = 0; x < n2; x++) {
            rarr[x] = arr[mid + 1 + x];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k++] = larr[i++];
            } else {
                arr[k++] = rarr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = larr[i++];
        }

        while (j < n2) {
            arr[k++] = rarr[j++];
        }
    }
}
