package day14.test1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        count(str);

    }

    public static void count(String str) {
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        Integer count = 1;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==' '){
                continue;
            }
            else if (!map.containsKey(ch[i])) {
                map.put(ch[i], count);
            } else {
                Integer a = map.get(ch[i]);
                map.replace(ch[i], ++a);
            }
        }
       // map.remove(' ');
        StringBuffer sb=new StringBuffer();
        Set<Character> set=map.keySet();
        for (Character c:set){
            Integer i=map.get(c);
            sb.append(c+"("+i+")");
        }
        System.out.println(sb);

    }
}
