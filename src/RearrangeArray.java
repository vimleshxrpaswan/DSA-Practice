import java.util.Arrays;

//Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the
//first occurrence of each element remains unchanged.
//For example:
//Input:  { 1, 2, 3, 1, 2, 1 }
//Output: { 1, 1, 1, 2, 2, 3 }
//Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
//Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }


public class RearrangeArray {
    public static void main(String[] args) {
        int[] input = {5, 4, 5, 5, 3, 1, 2, 2, 4};
        rearrangeArray(input);
        System.out.println("Input: " + Arrays.toString(input));
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        //Counting the frequency of each element in the array
        int[] frequency = new int[n];
        Arrays.fill(frequency, 1); // Initialize all frequencies to 1

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    frequency[i]++;
                    arr[j] = -1; // Mark duplicate elements to be ignored in the later steps
                }
            }
        }

        // Rearrange the array based on frequency and order of first occurrence
        int[] sortedArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int count = frequency[i];
                while (count > 0) {
                    sortedArray[index++] = arr[i];
                    count--;
                }
            }
        }

        // Copying the sorted array back to the original array
        System.arraycopy(sortedArray, 0, arr, 0, n);
    }
}
