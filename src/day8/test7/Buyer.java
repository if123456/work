package day8.test7;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String name, int num) {
        super(name, num);
    }

    @Override
    public void work() {
        System.out.println("工号为："+getNum()+"的采购专员 "+getName()+"在采购音响设备");
    }
}
