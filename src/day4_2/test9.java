package day4_2;

public class test9 {
    public static void main(String[] args) {
        String[] a={"♠","♥","♣","♦"};
        String[] b={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                System.out.print(a[i]+b[j]+" ");
            }
            System.out.println();
        }
    }
}
