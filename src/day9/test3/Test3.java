package day9.test3;

public class Test3 {
    public static void main(String[] args) {
        OldPhone oldPhone=new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();

        NewPhone newPhone=new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
