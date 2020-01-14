package day4;

public class test7 {
    public static void round(float n){
        if(n-(int)(n)>=0.5){
            n+=0.5;
            System.out.println(n+"->"+(int)(n));
        }
        else
            System.out.println(n+"->"+(int)(n));
    }

    public static void main(String[] args) {
       // System.out.println(10.15F-(int)(10.15));
        round(10.123f);
    }
}
