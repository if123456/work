package day12;

public class Test5 {
    public static void main(String[] args) {
        function(123);
        function("abc");
    }

    public static <E> void function(E e){
        System.out.println(e);
    }
}
