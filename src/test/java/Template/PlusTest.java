package Template;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by XJ-PC on 2018-8-9.
 */

public class PlusTest {
    @Test
    public void calculate() throws Exception {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }


}
