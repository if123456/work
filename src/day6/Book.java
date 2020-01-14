package day6;

public class Book {
    String name;
    String isbn;
    double price;

    public Book() {
    }

    public Book(String name, String isbn, double price) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show(){
        System.out.println("书名："+getName()+",ISBN编码"+getIsbn()+",价格"+getPrice());
    }
}

