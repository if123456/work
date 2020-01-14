package day5.test2;

public class Student {
    private String name;
    private int age;
    private String content;

    public Student() {
    }

    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }

    public void est(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"正在吃饭");
    }
    public void study(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"正在专心致志的听着"+getContent()+"的知识");
    }
}