package day21;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer>list=new ArrayList<>();
        Method method=list.getClass().getMethod("add",Object.class);
        method.invoke(list,"asdfghjkl");
        System.out.println(list.get(0));
    }
}
