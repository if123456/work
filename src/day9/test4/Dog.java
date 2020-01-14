package day9.test4;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHouse(){
        System.out.println("狗在看家");
    }
}
