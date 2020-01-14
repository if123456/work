package day6;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Book book = new Book();
            System.out.println("请录入第" + i + "本书的名称：");
            String name = input.next();
            book.setName(name);
            System.out.println("请录入第" + i + "本书的ISBN编码：");
            String isbn = input.next();
            book.setIsbn(isbn);
            System.out.println("请录入第" + i + "本书的价格：");
            double price = input.nextDouble();
            book.setPrice(price);
            books.add(book);
            //book.show();
        }
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            b.show();
        }

        //输出最贵的图书信息
        Book maxbook=books.get(0);
        for (int i = 0; i < books.size(); i++) {
            Book b= books.get(i);
            if(b.getPrice()>maxbook.getPrice()){
                maxbook=b;
            }
        }
        System.out.println("最贵图书信息：");
        maxbook.show();
        //System.out.println(maxbook);

        //排序
        for (int i = 0; i < books.size()-1; i++) {
            for (int j = 0; j < books.size()-i-1; j++) {
                if(books.get(j).getPrice()>books.get(j+1).getPrice()){
                    Book tbook =books.get(j);
                    books.set(j,books.get(j+1));
                    books.set(j+1,tbook);
                }
            }
        }
        System.out.println("排序后：");
        for (int i = 0; i < books.size(); i++) {
            Book b=books.get(i);
            b.show();
        }
    }
}
