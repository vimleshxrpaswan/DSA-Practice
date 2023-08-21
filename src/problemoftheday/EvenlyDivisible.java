package problemoftheday;

// Given a number N. Count the number of digits in N which evenly divides N.

// Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

// Example 1:

// Input:
// N = 12
// Output:
// 2
// Explanation:
// 1, 2 both divide 12 evenly
// Example 2:
public class EvenlyDivisible {
    static int countDigit(int n)
    {
        int temp = n, count = 0;
        while (temp != 0) {
            int d = temp % 10;
            temp = temp/10;
            if (d > 0 && n % d == 0)
                count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        int n =  12;
        System.out.println(countDigit(n));
    }
}

