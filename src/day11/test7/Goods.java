package day11.test7;

public class Goods {
    private String id;
    private String name;
    private double price;
    private String  unit;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Goods() {
    }

    public Goods(String id, String name, double price, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void show(){
        System.out.println(getId()+"\t\t"+getName()+"\t\t"+getPrice()+"\t\t"+getUnit());
    }

    public void showche(){
        System.out.println(getName()+"\t\t"+getPrice()+"\t"+getCount()+"\t\t"+getPrice()*getCount());
    }
}
