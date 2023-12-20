package arrayandarraylist;

public class Test {
    public static void main(String args[]) {
        int a = 1;
        A aObj = new A(1);
        modify(a, aObj);
        System.out.println(a);
        System.out.println(aObj.getA());
    }

    private static void modify(int a, A aObj) {
        a = 2;
        aObj.setA(2);
    }

}
