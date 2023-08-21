package geeksforgeeks;

import java.util.ArrayList;

// Given an array Arr of N positive integers.
// Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
public class ValueEqualToIndexValue {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i+1) {
                integerList.add(i+1);
            }
        }
        return integerList;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        int n= 5;
        System.out.println(valueEqualToIndex(arr,n));

    }

}
