package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test2_6 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Random random=new Random();

        while (set.size()<10){
            int a=random.nextInt(20)+1;
            set.add(a);
        }
        Iterator<Integer> iter=set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
