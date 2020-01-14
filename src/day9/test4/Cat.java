package day9.test4;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫在捉老鼠");
    }
}
