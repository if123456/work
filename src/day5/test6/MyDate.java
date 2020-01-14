package day5.test6;

public class MyDate {
    int year;
    int month;
    int day;
    public MyDate(){}
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void isBi(){
        System.out.println("日期:"+getYear()+"年"+getMonth()+"月"+getDay()+"日");
        if(year%100==0&&(year%400==0)){
            System.out.println(year+"是闰年");
        }
        else if(year%100==0&&(year%400!=0))
            System.out.println(year+"不是闰年");
        else if(year%100!=0&&year%4==0)
            System.out.println(year+"是闰年");
        else
            System.out.println(year+"不是闰年");
    }
}
