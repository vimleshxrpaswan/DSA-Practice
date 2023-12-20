package problemoftheday;

//Given an array of n integers. Find the minimum positive number to be inserted in array, so that sum of all elements of array becomes prime.
//
//Example 1:
//
//Input:
//N=5
//arr = {2, 4, 6, 8, 12}
//Output:
//5
//Explanation:
//The sum of the array is 32 ,we can add 5 to this to make it 37 which is a prime number.
//Example 2:

import java.util.Scanner;

public class Solution08122023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMinimumNumber(arr);

        System.out.println("The minimum positive number to be inserted in the array is: " + result);
    }

    static int findMinimumNumber(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int numToInsert = 1;
        while (!isPrime(sum + numToInsert)) {
            numToInsert++;
        }

        return numToInsert;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

