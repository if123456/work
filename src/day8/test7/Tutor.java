package day8.test7;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String name, int num) {
        super(name, num);
    }

    @Override
    public void work() {
            System.out.println("工号为："+getNum()+"的助教 "+getName()+"在帮学生解决问题");
    }
}
