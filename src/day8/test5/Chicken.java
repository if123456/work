package day8.test5;

public class Chicken extends Fowl {
    public Chicken() {
    }

    public Chicken(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }
    public void behavior(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
