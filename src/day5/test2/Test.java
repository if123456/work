package day5.test2;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("JAVA面向对象");
        t.est();
        t.teach();
        System.out.println("======================");
        Student stu=new Student("韩同学",18,"JAVA面向对象");
        //stu.Student();
        stu.est();
        stu.study();
    }
}
