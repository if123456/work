package day14.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test3_1 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, HashMap<String, String>> xiaomi = new HashMap<>();

        map1.put("001", "李晨");
        map1.put("002", "范冰冰");

        map2.put("001", "马云");
        map2.put("002", "马化腾");

        xiaomi.put("Java基础班", map1);
        xiaomi.put("Java就业班", map2);

        System.out.println(xiaomi);

        Set<String> set = xiaomi.keySet();

        for (String s : set) {
            System.out.println(s);
            HashMap<String, String> ss = xiaomi.get(s);
            Set<String> set1 = ss.keySet();
            for (String s1 : set1) {
                String s2 = ss.get(s1);
                System.out.println(s1 + "," + s2);
            }
        }

        Set<Map.Entry<String, HashMap<String, String>>> set1 = xiaomi.entrySet();
        Iterator iter = set1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
