package arrayandarraylist;

import java.util.Scanner;

public class DataStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string dataStream
        String dataStream = scanner.nextLine();

        // Initialize a variable to count unchanged characters
        int countUnchanged = 0;

        // Iterate through each character of dataStream
        for (int i = 0; i < dataStream.length(); i++) {
            // Check if the character at position i is the same as the character at the corresponding position
            // in the reversed string (dataStream.length() - i - 1)
            if (dataStream.charAt(i) == dataStream.charAt(dataStream.length() - i - 1)) {
                countUnchanged++;
            }
        }
        // Print the count of unchanged characters
        System.out.println(countUnchanged);

        scanner.close();
    }
}
