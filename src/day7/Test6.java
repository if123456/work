package day7;
import java.util.Random;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran=new Random();
        String str=input.next();
        String mgc="奥巴马";
        //String str= ran.next();
        System.out.println(str.replace(mgc,"*"));
    }
}
