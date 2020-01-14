package day8.test6;

public class Chef extends Employee{
    public Chef() {
    }

    public Chef(String num, String name, double salary) {
        super(num, name, salary);
    }

    @Override
    public void eat() {
        show();
        System.out.println("的厨师在吃肉");
    }

    @Override
    public void work() {
        show();
        System.out.println("的厨师在工作，炒菜");
    }
    public void show(){
        System.out.print("工号为："+getNum()+",姓名为:"+getName()+",工资为"+getSalary());
    }
}
