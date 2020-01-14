package day6;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Random ran=new Random();
        for (int i = 0; i < 5; i++) {
            int a =ran.nextInt(10)+1;
            System.out.println(a);
        }
    }
}
