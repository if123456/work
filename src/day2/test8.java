package day2;

import java.util.*;

public class test8 {
  /*  1. 定义类 Test
2. 定义 main方法
3. 定义char类型变量ch,赋值为'J'
            4. 使用强制转换的方式,将变量ch转换为小写'j',并输出
5. 定义char类型变量ch2,赋值为'a'
            6. 使用-=的方式,将变量ch2转换为大写'A',并输出
7. 定义double类型变量d3,int类型变量i3
8. 定义double变量sum3,保存d3与i3的和,输出sum3的值和sum3去除小数部分的值
9. 定义double类型变量d4,int类型变量i4
10. 定义int变量mul4,保存d4和i4乘积的整数部分,并输出*/
    public static void main(String[] args) {
        char ch='J';
        System.out.println((char)(ch+32));
        char ch2='a';
        System.out.println(ch2 -= 32);
       // System.out.println(ch2);
        Scanner input=new Scanner(System.in);
        System.out.println("输入d3和i3：");
        double d3=input.nextDouble();
        int i3=input.nextInt();
        double sum3=d3+i3;
        System.out.println("sum3的值:"+sum3);
        System.out.println("sum3的整数部分:"+(int)(sum3));
        System.out.println("输入d4和i4：");
        double d4=input.nextDouble();
        int i4=input.nextInt();
        int mul4=(int)(d4*i4);
        System.out.println("mul4的整数部分:"+mul4);
    }
}
