package day14.test1;

import java.util.*;

public class Test3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        String a = "";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                a += random.nextInt(10) + "";
            }
            set.add(a);
            a = "";
        }
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        HashMap<String, String> map = new HashMap<>();
        map.put(list.get(0), "苹果");
        map.put(list.get(1), "香蕉");
        map.put(list.get(2), "西瓜");
        map.put(list.get(3), "橘子");
        System.out.println(map);
        Scanner input = new Scanner(System.in);
        System.out.println("输入水果代号：");
        String str = input.nextLine();
        Set<String> set1 = map.keySet();
        for (String s : set1) {
            String fruit = map.get(s);
            if (s.equals(str)) {
                System.out.println(fruit);
                break;
            }
        }
    }
}
