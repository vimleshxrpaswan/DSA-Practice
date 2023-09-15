package arrayandarraylist;

import java.beans.Introspector;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        List<String> integers = new LinkedList<>();
        integers.add("Hello");
        integers.add("Hii");
        integers.add("bomsdk");
        Collections.reverse(integers);
        System.out.println(integers);
    }
}
