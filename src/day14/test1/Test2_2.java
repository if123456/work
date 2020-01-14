package day14.test1;

import java.util.HashMap;
import java.util.Set;

public class Test2_2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);
        System.out.println(map);
        map.replace("柳岩",map.get("柳岩")+300);
        System.out.println("柳岩工资加300");
        System.out.println(map);
        System.out.println();

        Set<String>set=map.keySet();
        for (String s:set){
            Integer salary=map.get(s);
            System.out.println("姓名："+s+",工资："+salary);
        }
    }
}
