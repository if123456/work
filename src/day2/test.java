package day2;
import java.util.*;
public class test {
    public static void main(String[] args){
       /* 1. 定义类 Test
        2. 定义int类型变量保存长方形的长
        3. 定义int类型变量保存长方形的宽
        4. 定义int类型变量保存长方形的面积,面积=长*宽
        5. 定义int类型变量保存长方形的周长,周长=(长+宽)*2
        6. 使用输出语句输出面积和周长*/
       Scanner input=new Scanner(System.in);
        System.out.print("输入长方形长和宽");
        int x=input.nextInt();
        int y=input.nextInt();
        int area=x*y;
        int circle=2*(x+y);
        System.out.println("长方形面积为："+area+"，周长为"+circle);

    }
}
