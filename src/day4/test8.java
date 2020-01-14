package day4;

public class test8 {
    public static void change1(float n){
        float a = (9.0f/5)*n+32;
        System.out.println("摄氏度为:"+n+"°--华氏度为："+a+"°");
    }

    public static void change2(float n){
        float a = (n-32)/(9.0f/5);
        System.out.println("华氏度为:"+n+"°--摄氏度为："+a+"°");
    }
    public static void main(String[] args) {
        change1(30.0f);
        change2(86.0f);
    }
}
