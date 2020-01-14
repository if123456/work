package day9.test7;

public class Test7 {
    public static void main(String[] args) {
        GouWuChe gouWuChe=new GouWuChe();
        Laptop laptop=new Laptop("g1000","笔记本",10000);
        Phone phone =new Phone("g1001","手机",5000);
        Fruit fruit=new Fruit("g2000","苹果",50);
        System.out.println("=======添加商品=======");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        System.out.println("=======打印商品=======");
        gouWuChe.showGoods();
        System.out.println("======================");
        gouWuChe.total();
    }
}
