package day17;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test3_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        File file=new File(str);

        HashMap<String,Integer>map=new HashMap<>();

        File[] files=file.listFiles();
        for (File f:files){
            if (f.isFile()){
                int a=f.getName().indexOf(".");
                String s=f.getName().substring(a+1);
                if(!map.containsKey(s)){
                    map.put(s,1);
                }else {
                    map.put(s,map.get(s)+1);
                }
            }
        }
        Set<String>set=map.keySet();
        for (String s:set){
            System.out.println(s+" 的类型文件有 "+map.get(s));
        }
    }
}
