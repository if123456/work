package day14.test2.test2_1;

public class Son extends Father {
    //不能重写与父类同级异常
//    public void eat()throws TonguePainException{
//    }
//
    //不能抛出比父类更高级的异常
//    public void eat()throws PainExecption{
//    }
//
//    public void eat()throws ToothPainException{
//        System.out.println("子类异常");
//    }

    //子类可以抛出父类的异常子类
//    public void eat()throws FrontToothPainExcption{
//    }

    //可以抛出多个父类的异常子类
//    public void eat()throws FrontToothPainExcption,BigToothPainException{
//        System.out.println("子类异常");
//    }
    //子类不能抛出异常
//    public void drink() throws ToothPainException {
//
//    }

    public void drink(){
        try {
            System.out.println("喝到100度的水");
            throw new  TonguePainException();
        }catch (TonguePainException e){
            System.out.println(e);
        }
    }
}
