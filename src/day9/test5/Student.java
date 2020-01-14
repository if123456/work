package day9.test5;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生吃学生餐");
    }
}
