package day10.test5;

public class Test5 {
    public static void main(String[] args) {
        Player player=new Player();
        System.out.println("选择：法力角色");
        FightAble f=player.select("法力角色");
        f.specialFight();
        f.commonFight();
        System.out.println("=============================");
        System.out.println("选择：武力角色");
        FightAble f2=player.select("武力角色");
        f2.specialFight();
        f2.commonFight();

    }
}
