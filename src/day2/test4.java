package day2;

public class test4 {
    public static void main(String[] args){
        /*1. 定义类 Test
        2. 定义 main方法
        3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
        4. 定义两个int类型变量b1和b2,分别赋值12,13,判断变量是否为奇数,拼接输出结果*/

        int a1=10;
        int a2=11;
        int b1=12;
        int b2=13;
        System.out.println(a1+"是偶数?"+(a1%2==0));
        System.out.println(a2+"是偶数?"+(a2%2==0));
        System.out.println(b1+"是奇数?"+(b1%2!=0));
        System.out.println(b2+"是奇数?"+(b2%2!=0));

    }
}
