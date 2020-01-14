package day11;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        //System.out.println(date.getTime());
        String str="2000-01-01";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date1= df.parse(str);
        //System.out.println(date1.getTime());
        long datecha=date.getTime()-date1.getTime();
        System.out.println(datecha/1000/60/60/24);
    }
}
