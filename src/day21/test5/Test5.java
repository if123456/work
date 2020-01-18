package day21.test5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args)throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("输入类名");
        String s=input.nextLine();
        Class c=Class.forName("day21.test5."+s);
        Object obj=c.newInstance();
        Method method=c.getMethod("showA");
        method.invoke(obj);

    }
}
