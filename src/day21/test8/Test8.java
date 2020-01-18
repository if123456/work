package day21.test8;

import day21.test3.Test3;

import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Test8 {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        p.load(Test3.class.getResourceAsStream("/test.properties"));
        String className=p.getProperty("class");
        Class c=Class.forName(className);
        System.out.println(c);
        Object obj=c.newInstance();
        Method method=c.getMethod("run");
        method.invoke(obj);
    }
}
