package day5.test5;

public class Manager {
     String name;
     int num;
     int jiang;
     int salary;

     public Manager(){}
     public Manager(String name,int num,int jiang,int salary){
         this.name=name;
         this.num=num;
         this.jiang=jiang;
         this.salary=salary;
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

    public int getJiang() {
        return jiang;
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

    public void setJiang(int jiang) {
        this.jiang = jiang;
    }

    public void intro(){
        System.out.println("经理姓名:"+getName());
        System.out.println("工号:"+getNum());
    }
    public void showSalary(){
        System.out.println("基本工资:"+getSalary()+",奖金:"+getJiang());
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
