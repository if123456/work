package day8.test6;

public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String num, String name, double salary) {
        super(num, name, salary);
    }

    @Override
    public void eat() {
        show();
        System.out.println("的经理在吃鱼");
    }

    @Override
    public void work() {
        show();
        System.out.println("的经理在工作，管理其他人");
    }

    public void show(){
        System.out.print("工号为："+getNum()+",姓名为:"+getName()+",工资为"+getSalary());
    }
}
