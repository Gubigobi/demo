package Builder;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by XJ-PC on 2018-8-10.
 */

public class DirectorTest {
    @Test
    public void createRobor() throws Exception {
        RobotBuilder robotBuilder = new RobotBuilder();
        Director director = new Director(robotBuilder);
        director.createRobor();
        System.out.println("=========="+robotBuilder.getLegoRobot().toString()+"==========");
    }

}
