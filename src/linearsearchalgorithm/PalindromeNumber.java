package linearsearchalgorithm;

public class PalindromeNumber {
    static boolean isPalindrome(int x){
        int rem, sum=0,temp;
        temp = x;
        while (x > 0){
            rem=temp%10;
            sum = (sum*10)+rem;
            temp=temp/10;
        }
        if (x==sum){
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));


    }
}
