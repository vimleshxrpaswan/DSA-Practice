package linearsearchalgorithm;

import java.util.Arrays;

public class SearchInString {
    static boolean search(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;
            }

            // checking using enhanced for loop
//            for (char ch: str.toCharArray()){
//                if (ch==target){
//                    return true;
//                }
//            }
        }
        return false;

    }
    public static void main(String[] args) {
        String fruit = "Mango";
        System.out.println(Arrays.toString(fruit.toCharArray()));
        char target = 'z';
        System.out.println(search(fruit,target));

    }
}
