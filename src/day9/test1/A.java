package day9.test1;

public interface A {
    void showA();

    default void showB() {
        System.out.println("BBBB");
    }
}
