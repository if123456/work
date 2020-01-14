package day12;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> pokerbox=new ArrayList<>();
        ArrayList<String> number=new ArrayList<>();
        ArrayList<String> color=new ArrayList<>();

        //扑克点数
        for (int i = 2; i <=10 ; i++) {
            number.add(i+"");
        }
        number.add("A");
        number.add("K");
        number.add("Q");
        number.add("J");

        //扑克花色
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        for(String colorss:color){
            for (String numberss:number){
                String str=colorss+numberss;
                pokerbox.add(str);
            }
        }

        pokerbox.add("小王");
        pokerbox.add("大王");

        //洗牌
        Collections.shuffle(pokerbox);

        //发牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for (int i = 0; i < pokerbox.size(); i++) {
            if(i>=51){
                dipai.add(pokerbox.get(i));
            }else if(i%3==0){
                player1.add(pokerbox.get(i));
            }else if(i%2==0){
                player2.add(pokerbox.get(i));
            }else {
                player3.add(pokerbox.get(i));
            }
        }
        System.out.println(pokerbox.size());
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

        for (int i = 0; i < 13; i++) {
            if(player1.contains("大王")){
                player1.addAll(dipai);
                break;
            }else if(player2.contains("大王")){
                player2.addAll(dipai);
                break;
            }else{
                player3.addAll(dipai);
                break;
            }
        }
        System.out.println("-----------------------");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
