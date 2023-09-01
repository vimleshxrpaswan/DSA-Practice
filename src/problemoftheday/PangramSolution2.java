package problemoftheday;
import java.util.Scanner;

//Check if the sentence is pangram.
//        A pangram is a sentence where every letter of the English alphabet appears at least once.
//        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//        Example 1:
//
//        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.
//        Example 2:
//
//        Input: sentence = "leetcode"
//        Output: false
public class PangramSolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String str = sc.next();
        char[] c = str.toCharArray();
        for(int j = 97; j < 122;j++) {
            flag = false;
            int counter =  0;
            for(int i = 0; i < c.length; i++) {
                if (j == (int) c[i]) {
                    counter++;
                }
                if (counter > 0) {
                    flag = true;

                }
            }
            if (flag==false) {
                System.out.println("not a panagram");
                break;
            }


        }
        if(flag){
            System.out.println("panagram");
        }
    }
}

