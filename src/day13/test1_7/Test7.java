package day13.test1_7;


import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet();
        set.add(new Person("张三",20));
        set.add(new Person("李四",19));
        set.add(new Person("王五",20));
        set.add(new Person("张三",20));

        for (Person p:set){
            System.out.println(p);
        }
    }
}
