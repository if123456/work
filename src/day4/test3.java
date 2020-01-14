package day4;

public class test3 {
    public static int getPerimeter(int length,int width){
        return (length+width)*2;
    }
    public static int getArea(int length,int width) {
        return length * width;
    }
    public static void main(String[] args) {
        int zc=getPerimeter(20,8);
        int area=getArea(20,8);
        System.out.println("长方形周长："+zc);
        System.out.println("长方形面积："+area);
    }
}
