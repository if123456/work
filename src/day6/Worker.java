package day6;

public class Worker {
    private String name;
    private int age;
    private String id;

    public Worker() {
    }

    public Worker(String id,String name,int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
    public void show(){
        System.out.println(getId()+","+getName()+","+getAge());
    }
}


