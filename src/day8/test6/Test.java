package day8.test6;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager("m101","老王",10000);
        manager.eat();
        manager.work();

        Chef chef=new Chef("c101","小王",6000);
        chef.eat();
        chef.work();
    }
}
