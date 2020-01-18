package day21.test11;

public class MyClass {

    @MyTest()
    public void method1() {
        System.out.println("Mytest注解");
    }

    @MyTest()
    public void method2() {
        System.out.println("Mytest注解2");
    }

    public void method3() {
        System.out.println("无注解");
    }

}
