package day11;

import java.util.Calendar;

public class Test3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print("现在时间：");
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        cal.add(Calendar.DAY_OF_MONTH, 500);
        int year1 = cal.get(Calendar.YEAR);
        int month1 = cal.get(Calendar.MONTH) + 1;
        int dayOfMonth1 = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print("500天后时间：");
        System.out.println(year1 + "年" + month1 + "月" + dayOfMonth1 + "日");

    }
}
