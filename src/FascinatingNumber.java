import java.util.HashSet;
import java.util.Set;

public class FascinatingNumber {
    public static void main(String[] args) {
        int number = 193;
        boolean isFascinating = isFascinatingNumber(number);

        if (isFascinating) {
            System.out.println(number + " is a fascinating number.");
        } else {
            System.out.println(number + " is not a fascinating number.");
        }
    }

    public static boolean isFascinatingNumber(int num) {
        if (num < 100) {
            return false;
        }

        int num2 = num * 2;
        int num3 = num * 3;

        String concatenated = Integer.toString(num) + num2 + num3;

        Set<Character> uniqueDigits = new HashSet<>();
        for (char digit : concatenated.toCharArray()) {
            if (digit >= '1' && digit <= '9') {
                uniqueDigits.add(digit);
            } else {
                return false;
            }
        }
        return uniqueDigits.size() == 9;
    }
}
