package day17;

public class Test1_9 {
    public static void main(String[] args) {
        int n=110;
        System.out.println("1到"+n+"的和为 "+sum(n));
    }

    public static int sum(int n){
        if (n==1){
            return 1;
        }

        return sum(n-1)+n;
    }
}
