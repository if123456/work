package day8.test5;

public class Test {
    public static void main(String[] args) {
        Chicken chicken=new Chicken(2,"红色");
        chicken.eat();
        chicken.behavior();
        System.out.println("---------------");
        Duck duck=new Duck(1,"黑色");
        duck.eat();
        duck.behavior();
    }
}
