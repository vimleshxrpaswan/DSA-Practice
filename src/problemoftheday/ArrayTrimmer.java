package problemoftheday;

public class ArrayTrimmer {
    public static int findMin(int[] arr)
    {
        int max_range = 0;
        int min, max;
        for (int i = 0; i < arr.length && arr.length - i > max_range; i++)
        {
            min = max = arr[i];
            for (int j = i; j < arr.length; j++)
            {
                min = Integer.min(min, arr[j]);
                max = Integer.max(max, arr[j]);
                if (2 * min <= max) {
                    break;
                }
                max_range = Integer.max(max_range, j - i + 1);
            }
        }
        return arr.length - max_range;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 4, 9};
        System.out.println("The minimum number of removals is " + findMin(arr));

    }
}
