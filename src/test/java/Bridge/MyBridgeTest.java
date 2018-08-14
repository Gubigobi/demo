package Bridge;


import Adapter.Source;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by XJ-PC on 2018-8-9.
 */

public class MyBridgeTest {
    @Test
    public void method() throws Exception {
        Bridge bridge  = new MyBridge();
        SourceSub1 s1 = new SourceSub1();
        bridge.setSource(s1);
        bridge.method();
        SourceSub2 s2 = new SourceSub2();
        bridge.setSource(s2);
        bridge.method();


    }


}
