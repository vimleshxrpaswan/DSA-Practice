package arrayandarraylist;

//https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] nums1 = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buidArray(nums1)));
    }
//    static int[] buildArray(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            nums[i] = n * (nums[nums[i]] % n) + nums[i];
//        }
//        for (int i = 0; i < n; i++) {
//            nums[i] = nums[i] / n;
//        }
//        return nums;
//    }


    static int[] buidArray(int[] nums){
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }

}
