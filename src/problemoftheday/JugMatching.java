package problemoftheday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JugMatching {
    public static void main(String[] args) {
        int[] red = {6, 3, 2, 8, 7};
        int[] blue = {8, 6, 7, 2, 3};

        matchJugs(red, blue);

        System.out.println("Red jugs: " + Arrays.toString(red));
        System.out.println("Blue jugs: " + Arrays.toString(blue));
    }

    public static void matchJugs(int[] red, int[] blue) {
        int n = red.length;
        Arrays.sort(red);
        Arrays.sort(blue);

        // Create a mapping of red jug sizes to their indices
        Map<Integer, Integer> redIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            redIndexMap.put(red[i], i);
        }

        // Rearrange blue jugs according to red jugs' order
        for (int i = 0; i < n; i++) {
            blue[i] = blue[redIndexMap.get(red[i])];
        }
    }
}

