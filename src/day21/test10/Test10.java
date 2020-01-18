package day21.test10;

@MyAnno1()
public class Test10 {
    @MyAnno2(type = "123")
    String s="";

    @MyAnno3(type = "abc",intArr = {1,2})
    public void showC(){
    }
}
