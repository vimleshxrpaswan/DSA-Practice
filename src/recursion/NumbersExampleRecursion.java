package recursion;

public class NumbersExampleRecursion {

    //write a function that takes a number and print it.
    // print five numbers: 1 2 3 4 5
    public static void main(String[] args) {
        print(1 );
    }

    static void print(int n){
        //base condition
        if (n==5){
            System.out.println(n); //body
            return;
        }
        System.out.println(n);
        //recursive call
        //this is called tail recursion
        //this is the last function called
        print(n+1);
    }



}
