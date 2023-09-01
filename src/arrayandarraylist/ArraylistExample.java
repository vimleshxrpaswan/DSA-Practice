package arrayandarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(10);
        integerList.add(12);
        integerList.add(23);
        integerList.add(2);
        integerList.add(32);
        integerList.add(23);
        integerList.add(23);
        integerList.add(1762);
        integerList.add(7);
        integerList.add(12);
        integerList.add(6);
        integerList.add(5);
        integerList.add(126);
        integerList.add(56);
        integerList.add(4);
        integerList.set(4,600);
        integerList.get(3);
        System.out.println(integerList);

    }
}
