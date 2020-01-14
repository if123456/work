package day5.test7;

public class Book {
    int num;
    String name;
    String isbn;
    double price;
    String pblish;

    public Book(){}
    public Book(int num,String name,String isbn,double price,String pblish){
        this.name=name;
        this.num=num;
        this.isbn=isbn;
        this.price=price;
        this.pblish=pblish;
    }

    public int getNum() {
        return num;
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

    public String getPblish() {
        return pblish;
    }

    public void setNum(int num) {
        this.num = num;
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

    public void setPblush(String pblush) {
        this.pblish = pblush;
    }

    public void showBook(){
        System.out.println("最贵图书信息：书号:"+getNum()+",书名:"+getName()+
                ",ISBN编码:"+getIsbn()+",价格:"+getPrice()+",出版日期:"+getPblish());
    }
}
