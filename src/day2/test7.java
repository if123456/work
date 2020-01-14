package day2;

import java.util.*;
public class test7 {
/*    1. 定义类 Test
2. 定义 main方法
3. 定义add方法,打印两个变量的和
4. 定义sub方法,打印两个变量的差
5. 定义mul方法,打印两个变量的积
6. 定义div方法,打印两个变量的商
7. 定义remain方法,打印两个变量的余数
8. main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法*/

    public static void add(int x,int y){
        System.out.println("x,y的和为："+(x+y));
    }

    public static void sub(int x,int y){
        System.out.println("x,y的差为："+(x-y));
    }

    public static void mul(int x,int y){
        System.out.println("x,y的积为："+(x*y));
    }

    public static void div(int x,int y){
        System.out.println("x,y的商为："+(x/y));
    }

    public static void remain(int x,int y){
        System.out.println("x,y的余为："+(x%y));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        add(x,y);
        sub(x,y);
        mul(x,y);
        div(x,y);
        remain(x,y);
    }
}
