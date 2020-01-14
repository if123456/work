package day5.test5;

public class Coder {
    String name;
    int num;
    int salary;

    public Coder() {
    }

    public Coder(String name, int num, int salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void intro() {
        System.out.println("程序员姓名:" + getName());
        System.out.println("工号:" + getNum());
    }

    public void showSalary() {
        System.out.println("基本工资:" + getSalary()+"奖金无");
    }

    public void work() {
        System.out.println("正在努力写代码....");
    }
}
