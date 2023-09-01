package arrayandarraylist;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "welcome";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length() ; j++) {
               char temp='\u0000';
                if (charArray[i] > charArray[j]){
                    temp=charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println("STR " + Arrays.toString(charArray) );
    }
}
