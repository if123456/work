package day12.test11;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "姓名：" + name +
                ", 年龄：" + age +
                ", 身高：" + height;
    }
}
