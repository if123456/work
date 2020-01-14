package day9.test3;

public class NewPhone extends OldPhone implements play{
    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发信息");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}
