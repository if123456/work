package day17;

public class Test1_10 {
    public static void main(String[] args) {
        System.out.println(nul(10));
    }

    public static int nul(int n){
        if(n==1){
            return 1;
        }
        if(n>10){
            return 0;
        }
        return nul(n-1)*n;
    }
}
