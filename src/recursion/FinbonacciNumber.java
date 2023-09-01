package recursion;


//Find Nth fibonacci number
// 0  1  1  2  3  5  8  13 ......
// fino (N) = Fibo(N-1) + Fibo(N+2)

public class FinbonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(10));

    }
    static int fibo(int n){
        //base condition
        if (n < 2){  // if calling fibo of 1 it will just return 1 and if u're calling fibo of 0 it will return 0
            return n;

        }

        return fibo(n-1) + fibo(n-2);
    }
}
