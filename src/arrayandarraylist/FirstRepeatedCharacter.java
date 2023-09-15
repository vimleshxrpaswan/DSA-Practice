package arrayandarraylist;

public class FirstRepeatedCharacter {
    public static String firstRepChar(String s) {
        int[] charIndex = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int index = currentChar - 'a';
            if (charIndex[index] > 0) {
                return String.valueOf(currentChar);
            } else if (charIndex[index] == 0) {
                charIndex[index] = i + 1;
            }
        }
        return "";
    }

        public static void main (String[]args){
            String s = "geeksforgeeks";
            String result = firstRepChar(s);
            if (!result.isEmpty()) {
                System.out.println("Output: " + result);
            } else {
                System.out.println("No repeated characters found.");
            }
        }

    }
