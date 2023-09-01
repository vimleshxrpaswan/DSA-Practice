package linearsearchalgorithm;

public class EvenDigit {

    static int findNumbers(int[] nums){
       int count=0;
       for (int num: nums){
           if ( even(num)){
               count++;

           }
       }
        return count;
    }

    private static boolean even(int num) {
        //    if (numberOfDigits % 2 == 0){
        //        return true;
        //    }
        //        return false;
        //    }
    int numberOfDigits =    digits2(num);
        return numberOfDigits % 2 != 0;
    }

    static int digits(int num){
            if (num < 0){
                num=num* -1;
            }

            if (num==0){
                return 1;
            }

            int count =0;
            while (num > 0){
                count++;
                num= num/10;  // num/=10
            }
            return count;
        }

        static int digits2(int num){
        return (int)(Math.log10(num)) +1;
        }



    public static void main(String[] args) {
        int[] nums = {22,334,2332,432343,342,232,232,3212};
        System.out.println( findNumbers(nums));
    }
}
