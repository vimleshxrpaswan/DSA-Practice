package arrayandarraylist;

import java.util.Arrays;

public class Swap {

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,7,2,7,5};
        swap(arr,3,2);
        System.out.println(Arrays.toString(arr));
    }
}
