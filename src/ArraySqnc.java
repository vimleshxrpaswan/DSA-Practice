import java.util.Arrays;

public class ArraySqnc {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] pos = { 3, 2, 4, 1, 0 };
        int[] arr = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            arr[pos[i]] = nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
