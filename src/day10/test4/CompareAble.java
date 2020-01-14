package day10.test4;

public interface CompareAble {
    default void compare(){
        System.out.println("默认挑大的");
    }
}
