package day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat format = new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        String str=format.format(date);
        System.out.println(str);
    }
}
