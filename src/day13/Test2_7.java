package day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        char[] ch=str.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        for (Character c:set){
            System.out.println(c);
        }
    }
}
