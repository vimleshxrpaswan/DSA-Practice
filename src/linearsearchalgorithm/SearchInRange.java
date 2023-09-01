package linearsearchalgorithm;

import java.util.Arrays;

public class SearchInRange {


    static int findTargetInRange(int[] arr, int targetValue, int start, int end){

        //checking the length of array first
        if (arr.length==0){
            return -1;
        }

        //searching and returning the index within range if the target value is found if not then -1
        for (int index = start; index <= end; index++) {
            if (arr[index]==targetValue){
                return index;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {12,32,434,1324,134,134,3,2};
        int target = 1324;
        System.out.println(findTargetInRange(arr,target,1,2)) ;

    }
}
