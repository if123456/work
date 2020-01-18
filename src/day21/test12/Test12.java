package day21.test12;

import java.lang.reflect.Method;

public class Test12 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<TestBook> clazz=TestBook.class;
        Method method=clazz.getMethod("showBook");

        Book b=method.getDeclaredAnnotation(Book.class);
        String name=b.value();
        double price=b.price();
        String[]author=b.author();
        System.out.println(name);
        System.out.println(price);
        for (int i = 0; i < author.length; i++) {
            System.out.println(author[i]);
        }

    }
}
