package day4_2;

public class test4 {
    public static void printBall(int[] arr){
        System.out.println("你的双色球号码为：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,8,10,12,18,28,12};
        printBall(arr);
    }
}
