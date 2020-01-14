package day5.test3;

public class Card {
     String type;
     String num;
    public Card(){}
    public Card(String type,String num){
        this.type=type;
        this.num=num;
    }
    public void showCard(){
        System.out.println(type+num);
    }
}
