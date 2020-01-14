package day12.test11;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        Person s1 = new Person("张三", 18, 1.6);
        Person s2 = new Person("李四", 16, 1.8);
        Person s3 = new Person("小王", 17, 1.73);
        Person s4 = new Person("大王", 18, 1.7);
        Person s5 = new Person("张飒", 18, 1.66);

        person.add(s1);
        person.add(s2);
        person.add(s3);
        person.add(s4);
        person.add(s5);

        Iterator<Person> iter=person.iterator();

        while (iter.hasNext()){
            Person p=iter.next();
            p.setAge(p.getAge()+2);
        }

        for(Person p:person){
            System.out.println(p.toString());
        }
    }
}
