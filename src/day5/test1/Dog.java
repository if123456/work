package day5.test1;

public class Dog {
    private String name;
    private int age;

    public void Dog(){
    }
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shoeMsg(){
        System.out.println("狗的名称："+getName()+",年龄为："+getAge());;
    }
}
