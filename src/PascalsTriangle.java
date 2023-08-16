//Given a non-negative integer n, print the first n rows of Pascal’s triangle.
//Each number in Pascal’s triangle is constructed by adding the two numbers diagonally above, where blank entries being interpreted as 0. For instance, the first eight rows of Pascal’s triangle are depicted in the diagram below.
//
//
//For Example:
//Input: n = 3
//Output: [[1], [1, 1], [1, 2, 1]]
//
//Input: n = 5
//Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

public class PascalsTriangle {
    static int factorial(int n) {
        int f;

        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }

    public static void main(String[] args) {
        System.out.println();
        int n, i, j;
        n = 7;

        for(i = 0; i <= n; i++) {
            for(j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+ncr(i, j));
            }
            System.out.println();
        }
    }
}
