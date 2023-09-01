package linearsearchalgorithm;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,4,2}, {12,12,23,45}, {98,67554,2,2},{53,2}};
        System.out.println(Arrays.toString(search(arr,67554)) );

    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if (arr[row][column]==target){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
