package day21.test4;

import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Class c=Shower.class;
        Shower shower=(Shower) c.newInstance();
        Method method=c.getMethod("show");
        method.invoke(shower);
    }
}
