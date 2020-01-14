package day9.test5;

public class SportStudent extends Student implements Sport{
    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+" "+getName()+" "+"的学生在打篮球");
    }
}
