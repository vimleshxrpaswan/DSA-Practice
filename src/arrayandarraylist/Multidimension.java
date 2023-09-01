package arrayandarraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];

        for (int row = 0; row < arr.length ; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length ; col++) { //every array at that row the length of that row
            arr[row][col]=in.nextInt();

            }
        }
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//
//            }
//            System.out.println();
//
//        }
//        for (int row = 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
            
        }

        /* 1   2   3
           3   4   5
           6   7   8
         */

//        int[][] arr = { {1,2,3}, // 0th index             //each array itself a different object
//                        {4,5,6},  // 1st index
//                        {7,8,9}};  // 2nd index  arr2D[2] = {6,7,8,9}

    }
}
