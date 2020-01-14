package day14.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test3_4 {

    public static void main(String[] args) {
        HashMap<Integer, String> pokermap = new HashMap<>();
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();

        number.add("A");
        //扑克点数
        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("J");
        number.add("Q");
        number.add("K");

        //扑克花色
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        int count = 0;
        pokermap.put(++count, "大王");
        pokermap.put(++count, "小王");


        for (String numberss : number) {
            for (String colorss : color) {
                String str = colorss + numberss;
                pokermap.put(++count, str);
            }
        }

        System.out.println(pokermap);
        Set<Integer> set = pokermap.keySet();
        System.out.println(set);

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        ArrayList<Integer> poker = new ArrayList<>(set);
        Collections.shuffle(poker);

        for (int i = 0; i < poker.size(); i++) {
            if (i > 50) {
                diPai.add(poker.get(i));
            } else if (i % 3 == 0) {
                player1.add(poker.get(i));
            } else if (i % 3 == 1) {
                player2.add(poker.get(i));
            } else{
                player3.add(poker.get(i));
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);

        System.out.println("play1:" + player1);
        System.out.println("play2:" + player2);
        System.out.println("play3:" + player3);
        System.out.println("play1:" + diPai);

        System.out.print("play1:");
        for (Integer i1 : player1) {
            String s1 = pokermap.get(i1);
            System.out.print(s1 + ",");
        }
        System.out.println();
        System.out.print("play2:");
        for (Integer i2 : player2) {
            String s2 = pokermap.get(i2);
            System.out.print(s2 + ",");
        }
        System.out.println();
        System.out.print("play3:");
        for (Integer i3 : player3) {
            String s3 = pokermap.get(i3);
            System.out.print(s3 + ",");
        }
        System.out.println();
        System.out.print("底牌:");
        for (Integer i4 : diPai) {
            String s4 = pokermap.get(i4);
            System.out.print(s4 + ",");
        }
    }
}
