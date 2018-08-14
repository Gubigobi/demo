package Decorator;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by XJ-PC on 2018-8-8.
 */

public class DecoratorTest {
    @Test
    public void method1() throws Exception {
//        Sourceable source = new Source();
//        Decorator decorator = new Decorator(source);
//        decorator.method1();
        //代理模式
        Sourceable source = new Decorator();
        source.method1();
    }



}
