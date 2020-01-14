package day14.test1;

import java.util.*;

public class Test2_8 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        while (map.size() < 5) {
            String s = input.nextLine();
            double score = random.nextInt(100) + 1;
            map.put(s, score);
        }
        System.out.println(map);
        Collection<Double> coll = map.values();
        double sum = 0;
        double max = 0;
        double min = 0;
        Iterator<Double> iter = coll.iterator();
        while (iter.hasNext()) {
            max = iter.next();
            min = iter.next();
            break;
        }

        Set<String> set = map.keySet();
        for (String s : set) {
            double score = map.get(s);
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        System.out.println("总分=" + sum);
        System.out.println("最高分=" + max);
        System.out.println("最低分=" + min);
        System.out.println("平均分=" + sum / map.size());
    }
}
