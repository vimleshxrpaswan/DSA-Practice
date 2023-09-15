package arrayandarraylist;

public class LuckyNumbers {
    static boolean isLucky(int n, int position, int counter){
        if (position == n){
            return true;
        }
        if (n % counter == 0){
            return false;
        }
        int next_position =  position - position/counter;
        return isLucky(n, next_position, counter + 1);
    }
    static int isLucky(int n){
        return isLucky(n,n,2) ? 1 : 0;
    }

    public static void main(String[] args) {
        int n  = 19;
        int lucky = isLucky(n);
        System.out.println(lucky);

    }
}
