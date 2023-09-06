package linearsearchalgorithm;

public class FindMin {
    static int min(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {77,1,4,56,-5};
        System.out.println(min(arr));
    }
}
