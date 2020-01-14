package day10.test4;

public class Worker {
    public Apple pickApple(CompareAble c,Apple a1,Apple a2){
        c.compare();
        if(a1.getSize()>a2.getSize()){
            return a1;
        }else
            return a2;
    }
}
