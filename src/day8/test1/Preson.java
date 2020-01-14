package day8.test1;

public class Preson {
    private String name;
    private int age;

    public Preson() {
    }

    public Preson(String name, int age) {
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

    public void eat(){
        System.out.println(name+"吃饭");
    }

    public void sleep(){
        System.out.println(name+"睡觉");
    }
}
