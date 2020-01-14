package day14.test1;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Test2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        HashMap<String, Integer> map = new HashMap<>();

        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
                countingKey(map,"字母");
            }
            else if(ch[i]==' '){
                countingKey(map,"空格");
            }
            else if(ch[i]>='0'&&ch[i]<='9'){
                countingKey(map,"数字");
            }else {
                countingKey(map,"其他");
            }
        }
        System.out.println(map);
    }
    public static void countingKey(HashMap map, String key){
        if(!map.containsKey(key)){
            map.put(key,1);
        }else{
            Integer a= (Integer) map.get(key);
            map.replace(key,++a);
        }
    }
}
