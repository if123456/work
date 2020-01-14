package day8.test2;

public class Test2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("旺财");
        dog.eat();
        dog.lookHouse();
        System.out.println("-------------");
        Cat cat=new Cat();
        cat.setName("波斯猫");
        cat.eat();
        cat.catchmouse();
    }
}
