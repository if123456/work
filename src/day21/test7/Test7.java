package day21.test7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Test7 {
    public static void main(String[] args) {
        Class c=Person.class;
        try {
            Person p1=(Person)c.newInstance();
            Constructor<Person> cMethod =c.getConstructor(String.class,int.class);
            Person p2 = cMethod.newInstance("lisi",10);
            p1.setName("zhangsan");

            Field field=c.getDeclaredField("age");
            field.set(p1,20);
            System.out.println(p1);
            System.out.println(p2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
