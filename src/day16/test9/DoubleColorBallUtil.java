package day16.test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DoubleColorBallUtil {
    public String create() {
        ArrayList<String> hong=new ArrayList<>();
        ArrayList<String> lan=new ArrayList<>();
        for (int i = 1; i < 34; i++) {
            hong.add("红"+i);
        }
        for (int i = 1; i < 17; i++) {
            lan.add("蓝"+i);
        }
        String[] red= hong.toArray(new String[0]);
        String[] blue= lan.toArray(new String[0]);
        boolean[] used = new boolean[red.length];
        Random r = new Random();
        String[] all = new String[7];
        for (int i = 0; i < 6; i++) {
            int idx;
            do {
                idx = r.nextInt(red.length); //0‐32
            }
            while (used[idx]);  //如果使用了继续找下一个
            used[idx] = true;   //标记使用了
            all[i] = red[idx];  //取出一个未使用的红球
        }
        all[all.length-1] =blue[r.nextInt(blue.length)];
        Arrays.sort(all);
        return Arrays.toString(all);
    }
}