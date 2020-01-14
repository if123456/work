package day8.test7;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String name, int num) {
        super(name, num);
    }

    @Override
    public void work() {
        System.out.println("工号为："+getNum()+"的讲师 "+getName()+"在讲课");
    }
}
