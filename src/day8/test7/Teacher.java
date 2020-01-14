package day8.test7;

public abstract class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String name, int num) {
        super(name, num);
    }

    @Override
    public abstract void work();
}
