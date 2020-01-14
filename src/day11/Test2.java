package day11;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test2 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String str="2000-01-01";
        Date date= df.parse(str);
        System.out.println(date);
    }
}
