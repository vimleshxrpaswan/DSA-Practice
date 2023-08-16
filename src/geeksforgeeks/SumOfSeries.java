package geeksforgeeks;

//Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
public  class SumOfSeries {

    static long seriesSum(int n) {
        return(long) n* (n+1)/2;
    }
    public static void main(String[] args) {
        System.out.println( SumOfSeries.seriesSum(10));

    }

}
