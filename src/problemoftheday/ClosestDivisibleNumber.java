package problemoftheday;

import java.util.Scanner;

public class ClosestDivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.print("Enter M: ");
        int m = scanner.nextInt();

        int closestDivisibleNumber = findClosestDivisibleNumber(n, m);
        System.out.println("Closest number divisible by " + m + " and closest to " + n + " is: " + closestDivisibleNumber);

    }

    static int findClosestDivisibleNumber(int n, int m) {
        int quotient = n / m;
        int num1 = m * quotient;
        int num2 = (n > 0) ? m * (quotient + 1) : m * (quotient - 1);

        if (Math.abs(n - num1) < Math.abs(n - num2)) {
            return num1;
        } else if (Math.abs(n - num1) > Math.abs(n - num2)) {
            return num2;
        } else {
            return Math.max(num1, num2);
        }
    }
}

