package day4;

public class test5 {
    public static void showColor(String color){
        switch (color){
            case "red":
                System.out.println(color+"是红色");break;
            case "blue":
                System.out.println(color+"是蓝色");break;
            case "green":
                System.out.println(color+"是绿色");break;
                default:
                    System.out.println(color+"颜色未知");break;
        }
    }
    public static void main(String[] args) {
        showColor("red");
    }
}
