package arrayandarraylist;

import java.util.Scanner;

public class Main {
    public static int sumPrime(int rangeLeft, int rangeRight) {
        int answer = 0;
        int smallestPrime = Integer.MAX_VALUE;
        int largestPrime = Integer.MIN_VALUE;

        for (int num = rangeLeft; num <= rangeRight; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                smallestPrime = Math.min(smallestPrime, num);
                largestPrime = Math.max(largestPrime, num);
            }
        }

        answer = smallestPrime + largestPrime;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for rangeLeft
        int rangeLeft = in.nextInt();

        // Input for rangeRight
        int rangeRight = in.nextInt();

        int result = sumPrime(rangeLeft, rangeRight);
        System.out.print(result);

        in.close();
    }
}
