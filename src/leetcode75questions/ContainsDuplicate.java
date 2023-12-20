package leetcode75questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));

    }

//    public static boolean containsDuplicate(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] == nums[j])
//                    return true;
//            }
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for (int num: nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);

        }
        return false;
    }


//    public static boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> seen = new HashMap<>();
//        for (int num : nums) {
//            if (seen.containsKey(num) && seen.get(num) >= 1)
//                return true;
//            seen.put(num, seen.getOrDefault(num, 0) + 1);
//        }
//        return false;
//    }
}
