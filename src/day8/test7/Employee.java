package day8.test7;

public abstract class Employee {
    private String name;
    private int num;

    public Employee() {
    }

    public Employee(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public abstract void work();
}
