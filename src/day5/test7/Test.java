package day5.test7;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book(1, "java实战", "isbn123456789", 60, "2017-01-01");
        Book book2 = new Book(2, "java1", "isbn123456789", 55.5, "2017-01-01");
        Book book3 = new Book(3, "java2", "isbn123456789", 54.5, "2017-01-01");
        double a = book1.getPrice();
        double b = book2.getPrice();
        double c = book3.getPrice();
        Book maxbook = book1;
        if (a < b) {
            maxbook = book2;
        }
        if (b < c) {
            maxbook = book3;
        }
        maxbook.showBook();
    }
}


