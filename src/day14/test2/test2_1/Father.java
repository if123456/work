package day14.test2.test2_1;

public class Father {
    public void eat()throws ToothPainException{
        System.out.println("吃到一个石子");
        throw new ToothPainException("吃到一个石子");
    }

    public void drink(){
        System.out.println("喝什么都没有问题");
    }

}
