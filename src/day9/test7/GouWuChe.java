package day9.test7;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Good> list=new ArrayList();
    public void addGoods(Good good){
//        list.add(good.getNum()+","+good.getName()+","+good.getPrice());
        list.add(good);
        System.out.println("加入 "+good.getName()+" 成功");
    }

    public void showGoods(){
        System.out.println("你选购的商品为：");
        for (int i = 0; i < list.size(); i++) {
            Good g=list.get(i);
            System.out.println(g.getNum()+","+g.getName()+","+g.getPrice());
        }
    }

    public void total(){
        double sum=0;
        double off=0;
        for (int i = 0; i < list.size(); i++) {
            Good g=list.get(i);
            sum+=g.getPrice();
        }
        System.out.println("原 价为："+sum);
        for (int i = 0; i < list.size(); i++) {
            Good g=list.get(i);
            double price=g.getPrice();
           if (g instanceof EGoods){
             price*=0.88;
           }
            off+=price;
        }

        System.out.println("折后价为："+off);
    }
}
