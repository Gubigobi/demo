package Adapter;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by XJ-PC on 2018-8-8.
 */

public class AdapterTest {
    @Test
    public void method2() throws Exception {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
        adapter.method3();
    }

    @Test
    public void method2t() throws Exception {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();
    }

}
