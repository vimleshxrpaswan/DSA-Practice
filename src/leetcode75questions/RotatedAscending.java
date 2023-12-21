package leetcode75questions;

import java.util.Arrays;

//Find Minimum in Rotated Sorted Array
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
//the array nums = [0,1,2,4,5,6,7] might become:

public class RotatedAscending {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println((productExceptSelf(nums)));

    }

    public static int productExceptSelf(int[] nums) {
//        Arrays.sort(nums);
//        return nums[0];
        int min = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
