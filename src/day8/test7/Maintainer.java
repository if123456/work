package day8.test7;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String name, int num) {
        super(name, num);
    }

    @Override
    public void work() {
        System.out.println("工号为："+getNum()+"的维修专员 "+getName()+"在解决不能共享屏幕问题");
    }
}
