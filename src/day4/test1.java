package day4;

public class test1 {
    public static void printEven(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printEven(20);
    }
}
