package binarysearchalgorithm;

public class BinarySearch {
    public static void main(String[] args) {

        // arr is already sorted in ascending order
        int[] arr = {-6,-5,-3,-2,10,13,16,90,100,120,150};
        int target = -22;
        System.out.println(binarySearch(arr,target));
    }

    //return the index of the target element
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //find the middle element
            // int middle = (start + end)/2; might be possible that (start + end) exceeds the range of the int
            int middle = start + (end - start) /2;
            if (target < arr[middle]){
                //here start will not change and the end will become middle -1
                end = middle -1 ;
            }
            // here start will get changed and new start will middlw will be + 1
            else if (target > arr[middle]) {
                start = middle + 1;
            }
            // if target == middle
            else return middle;
        }
        return -1;
    }
}
