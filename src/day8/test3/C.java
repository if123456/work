package day8.test3;

public class C extends B{
    int numc=30;
    @Override
    public void showB() {
        System.out.println("A类中numa:"+super.numb);
        //super.showa();
    }

    @Override
    public void showa() {
        System.out.println("B类中numb:"+super.numa);
    }

    public void showC(){
        System.out.println("C类中numc:"+numc);
    }
}
