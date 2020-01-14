package day8.test5;

public class Duck extends Fowl{
    public Duck() {
    }

    public Duck(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");
    }
    public void behavior(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }
}
