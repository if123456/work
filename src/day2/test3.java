package day2;

import java.util.*;
public class test3 {
    public static void main(String[] args){
       /* 1. 定义类 Test
        2. 定义 main方法
        3. 定义 int类型变量i1 和 long类型变量l1
        4. 定义变量add,保存i1和l1的和,并输出.
        5. 定义 long类型变量l2 和 float类型变量f2
        6. 定义变量add2,保存l2和f2的和,并输出.
        7. 定义 int类型变量i3 和 double类型变量d3
        8. 定义变量add3,保存i3和d3的和,并输出*/
        Scanner input = new Scanner(System.in);
        int i1 = input.nextInt();
        long l1 = input.nextLong();
        long add = i1+l1;
        System.out.println("add的值:"+add);
        long l2 = input.nextLong();
        float f2 = input.nextFloat();
        float add2 = l2+f2;
        System.out.println("add2的值:"+add2);
        int i3 = input.nextInt();
        double d3 = input.nextDouble();
        double add3 = i3+d3;
        System.out.println("add3的值:"+add3);

    }
}
