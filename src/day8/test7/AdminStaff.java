package day8.test7;

public abstract class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String name, int num) {
        super(name, num);
    }

    @Override
    public abstract void work() ;
}
