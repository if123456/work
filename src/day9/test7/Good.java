package day9.test7;

public class Good {
    private String num;
    private String name;
    private double price;

    public Good() {
    }

    public Good(String num, String name, double price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
