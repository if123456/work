package day11.test7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //建立商品对象
        Goods goods = new Goods("001", "少林核桃", 15.5, "斤");
        Goods goods2 = new Goods("002", "星星饼干", 14.5, "包");
        Goods goods3 = new Goods("003", "移动硬盘", 345, "个");
        Goods goods4 = new Goods("004", "学习资源", 199, "G");
        ArrayList<Goods> list = new ArrayList<>();
        list.add(goods);
        list.add(goods2);
        list.add(goods3);
        list.add(goods4);

        //正则表达式
        String reg = "\\d{3}-\\d{1,2}";

        //存在输入字符串的数组
        ArrayList<String> gods = new ArrayList<>();

        //存在购物车
        ArrayList<Goods> che = new ArrayList<>();

        //存在商品id的数组
        List<String> id = new ArrayList<>();

        System.out.println("欢迎使用超市购物系统");
        while (true) {
            System.out.println("请输入你要进行的操作");
            System.out.println("1:购买商品\t2:结算并打印小票\t3:退出系统");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();

            //显示商品
            if (a == 1) {
                System.out.println("------------------------------------");
                System.out.println("商品列表");
                System.out.println("商品id\t名称\t\t\t单价\t\t计价单位");
                for (int i = 0; i < list.size(); i++) {
                    Goods g = list.get(i);
                    g.show();
                }
                System.out.println("------------------------------------");
                System.out.println("请输入你要购买的商品项（输入格式：商品id-购买数量）,输入end表示购买结束");

                //购买商品输入商品信息数量
                while (true) {
                    String str = input.nextLine();
                    if ("end".equals(str)) {
                        System.out.println("购买结束");
                        System.out.println("------------------------------------");
                        break;
                    } else if (!str.matches(reg)) {
                        System.out.println("输入有误，请重新输入");
                    } else {
                        String s = str.substring(0, 3);
                        for (int i = 0; i < list.size(); i++) {
                            id.add(list.get(i).getId());
                        }
                        for (int i = 0; i < id.size(); i++) {
                            if (id.contains(s))
                                break;
                            else {
                                System.out.println("商品id为"+s+"不存在，请重新输入");
                                break;
                            }
                        }
                        gods.add(str);
                    }
                }
            }

            //统计商品价格
            else if (a == 2) {
                System.out.println("------------------------------------");
                System.out.println("欢迎光临");
                System.out.println("名称\t\t\t售价\t\t数量\t\t金额");
                System.out.println("------------------------------------");

                //商品字符串分割
                for (int i = 0; i < gods.size(); i++) {
                    String str1 = gods.get(i).substring(0, 3);
                    String str2 = gods.get(i).substring(4);
                    for (int j = 0; j < list.size(); j++) {
                        if (str1.equals(list.get(j).getId())) {
                            list.get(j).setCount(Integer.parseInt(str2));
                            che.add(list.get(j));
                        }
                    }
                }

                //购物车统计
                double sum = 0;
                int count = 0;
                for (int i = 0; i < che.size(); i++) {
                    Goods g = che.get(i);
                    g.showche();
                    sum += (g.getPrice() * g.getCount());
                    count += g.getCount();
                }
                System.out.println("------------------------------------");
                System.out.println("共" + che.size() + "项商品");
                System.out.println("共" + count + "件商品");
                System.out.println("共" + sum + "元");
                System.out.println("------------------------------------");

            }

            //结束系统
            else if (a == 3) {
                System.out.println("感谢你使用超市购物系统，欢迎下次光临，拜拜");
                System.exit(0);
            } else
                System.out.println("输入有误，请重新输入");
        }

    }
}
