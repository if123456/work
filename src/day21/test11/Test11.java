package day21.test11;

import java.lang.reflect.Method;

public class Test11 {

    public static void main(String[] args)throws Exception {

        MyClass mc=new MyClass();
        Class c=mc.getClass();
        Method[] methods=c.getMethods();
        for(Method m:methods){
            if(m.isAnnotationPresent(MyTest.class)){
                m.invoke(mc);
            }
        }

//        Class<MyClass> clazz=MyClass.class;
//        MyClass mc=clazz.newInstance();
//        Method[] methods=clazz.getMethods();
//        for(Method m:methods){
//            if(m.isAnnotationPresent(MyTest.class)){
//                m.invoke(mc);
//            }
//        }


    }

}
