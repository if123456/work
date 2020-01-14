package day4;

public class test6 {
    public static void printx(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i||j==n-1-i){
                    System.out.print("0");}
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printx(8);
    }
}
