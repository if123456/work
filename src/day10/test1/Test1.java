package day10.test1;

public class Test1 {
    public static void main(String[] args) {
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                //num="23.23456789";
                int a = num.indexOf(".");
                System.out.println("取整后:" + num.substring(0, a));
            }
        }.HandleString("23.23456789");


        new HandleAble() {
            @Override
            public void HandleString(String num) {
                double d = Double.parseDouble(num);
                String num1 = String.format("%.4f", d);
                //int a=num.indexOf(".");
                //System.out.println("保留4位小数后:"+num.substring(0,a+5));
                System.out.println("保留4位小数后:" + num1);
            }
        }.HandleString("23.23456789");

    }
}
