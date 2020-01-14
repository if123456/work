package day13;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2_9 {
    public static void main(String[] args) {
        ArrayList<String> array1=new ArrayList<>();
        ArrayList<String> array2=new ArrayList<>();
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");

        array2.add("e");
        array2.add("f");
        array2.add("a");
        array2.add("d");
        array2.add("g");

        HashSet<String> set=new HashSet<>();
        set.addAll(array1);
        set.addAll(array2);
        System.out.println(set);

    }
}
