package day14.test2.test3_1;

public class DebitCard {
    private String accountNumber;
    private double money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) throws NoNegativeException {
        if(money<0){
            throw new NoNegativeException("余额不能为负数"+money);
        }
        this.money = money;
    }
}
