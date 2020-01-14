package day9.test4;

public class Test4 {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.eat();
        cat.eat();
        if(dog instanceof Dog){
            Dog dog1=(Dog) dog;
            dog1.lookHouse();
        }

        if (cat instanceof Cat){
            Cat cat1=(Cat) cat;
            cat1.catchMouse();
        }
    }
}
