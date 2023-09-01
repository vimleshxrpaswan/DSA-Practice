package arrayandarraylist;

import java.util.Arrays;

public class MaxValue {
    static int max(int[] arr){
        int max= arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

            static int maxInRange(int[] arr, int start, int end){
                int max= arr[0];
                for (int i = start; i <= end ; i++) {
                    if (arr[i]>max){
                        max=arr[i];
                    }
                }
                return max;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;

        }

    }


    public static void main(String[] args) {
        int[] arr={6,3,7,9,2,32,9};
//        System.out.println(max(arr));
//        System.out.println(maxInRange(arr,1,3)) ;
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
}
