package day21.test6;

import java.lang.reflect.Field;

public class User {
    private  String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setProperty(Object obj,String propertyName,Object value){
        Class c=obj.getClass();
        try {
            Field field=c.getDeclaredField(propertyName);
            field.setAccessible(true);
            field.set(obj,value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getProperty(Object obj,String propertyName){
        Class c=obj.getClass();

        try {
            Field field=c.getDeclaredField(propertyName);
            field.setAccessible(true);
            obj= field.get(obj);
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
