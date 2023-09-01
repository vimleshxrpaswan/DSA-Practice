package arrayandarraylist;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class Arrayconcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

//    static int[] getConcatenation(int[] nums) {
//        int[] arr = new int[nums.length * 2];
//        int n = nums.length;
//        for (int i = 0; i <= n / 2; i++) {
//            arr[i] = nums[i];
//            arr[n + i] = nums[i];
//            arr[n - 1 - i] = nums[n - 1 - i];
//            arr[2 * n - 1 - i] = nums[n - 1 - i];
//        }
//        return arr;
//
//    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            arr[i] = arr[n + i] = nums[i];
        }

        return arr;
    }

}
