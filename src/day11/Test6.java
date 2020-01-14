package day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) throws Exception{
        //Date date = new Date();
        //DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2016-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse(s);
        sdf.applyPattern("yyyy年MM月dd日");
        String str1 = sdf.format(date1);
        System.out.println(str1);

    }
}
