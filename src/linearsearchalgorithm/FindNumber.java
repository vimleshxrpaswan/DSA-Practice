package linearsearchalgorithm;

public class FindNumber {
    public int findNumbers(int[] nums) {
        int resulltCount = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            if(nums[i] < 0)
                nums[i] *= -1;
            while(nums[i] != 0){
                nums[i] /= 10;
                count++;
            }
            if(count % 2 == 0)
                resulltCount += 1;
        }

        return resulltCount;
    }









    public static void main(String[] args) {
        int[] num  = {22,34,5,23,-4567,233,12324,345322};
        int resulltCount = 0;
//        for(int i = 0; i < num.length; i++){
//            int count = 0;
//            if(num[i] < 0)
//                num[i] *= -1;
//            while(num[i] != 0){
//                num[i] /= 10;
//                count++;
//            }
//            if(count % 2 == 0)
//                resulltCount += 1;
//        }
        System.out.println("ResultCount :: " + resulltCount);
    }


}
