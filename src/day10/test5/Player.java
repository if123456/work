package day10.test5;

public class Player {
    public FightAble select(String str) {
        if ("法力角色".equals(str)) {
            Master master = new Master();
            return master;
        }
        if ("武力角色".equals(str)) {
            Warrior warrior=new Warrior();
            return warrior;
        }
        return null;
    }
}