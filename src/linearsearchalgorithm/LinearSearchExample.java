package linearsearchalgorithm;

public class LinearSearchExample {

    static int findTarget(int[] arr, int targetValue){
        //checking the length of array first
        if (arr.length==0){
            return -1;
        }
        //searching and returning the index if the target value is found if not then -1
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]==targetValue){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,4344,234,132,32};
        System.out.println(findTarget(arr,3)) ;


    }
}
