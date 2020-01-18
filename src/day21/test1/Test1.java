package day21.test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
      Calculator cal;
    //Calculator cal;

    @BeforeClass
    public static void init() {
        System.out.println("类加载时，只运行一次");
    }

    @Before
    public void MyBefore() {
        cal=new Calculator();
        System.out.println("方法前");
    }

    @Test
    public void method1() {
        cal.add(1,1);
    }

    @Test
    public void method2() {
        cal.jian(2,1);
    }

    @Test
    public void method3() {
        cal.cheng(2,2);
    }

    @Test
    public void method4() {
        cal.chu(4,2);
    }

    @After
    public void MyAfter() {
        cal=null;
        System.out.println("方法后");
    }

    @AfterClass
    public static void destory() {
        System.out.println("类结束前，只运行一次");
    }

}
