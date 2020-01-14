package day6;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a=input.nextInt();
        System.out.println("请输入第二个数据：");
        int b=input.nextInt();
        System.out.println("请输入第三个数据：");
        int c=input.nextInt();
        int t=a>b?a:b;
        int max=t>c?t:c;
        System.out.println("三个数的最大值："+max);
    }
}
