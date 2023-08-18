package geeksforgeeks;
//Given an integer array arr of size n, you need to sum the elements of arr.
//
//Example 1:
//
//Input:
//n = 3
//arr[] = {3 2 1}
//Output: 6
public class SumOfArrayElements {
    public static int sumElement(int arr[], int n)
    {
        int sum = 0;
        for (int i = 0  ; i < n; i++) {
             sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 4;
        System.out.println(sumElement(arr,n));
    }
}
