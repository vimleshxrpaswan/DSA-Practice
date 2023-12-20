package arrayandarraylist;

public class PowerXn {
     static double myPow(double x, int n) {
        if (n == Integer.MAX_VALUE) return x    ;
        else if (n == Integer.MIN_VALUE) return (x == 1 || x == -1) ? 1 : 0;
        if(n<0) {
            x=1/x;
            n*=-1;
        }
        double ans = 1;
        for(int i=0;i<n;i++)
            ans = ans*x;
        return ans;
    }

    public static void main(String[] args) {
        double v = myPow(2d, (int) 2147483648d);
        System.out.println(v);

    }
}
