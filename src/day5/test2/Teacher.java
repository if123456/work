package day5.test2;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher(){
    }
    public void Teacher(String name, int age, String content) {
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
    public void teach(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"正在亢奋地讲着"+getContent()+"的知识");

    }
}
