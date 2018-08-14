package Builder;

/**
 * @auther XJ-PC xj
 * @create 2018-8-1014:26
 */
public class RobotBuilder implements Builder{
    public LegoRobot legoRobot;

    public RobotBuilder(){
        legoRobot = new LegoRobot();
    }

    @Override
    public void createHead() {
        legoRobot.setHead("create robot Head success!");
    }

    @Override
    public void createHand() {
        legoRobot.setHand("create robot Hand success!");
    }

    @Override
    public void createBody() {
        legoRobot.setBody("create robot Body success!");
    }

    @Override
    public void createWheel() {
        legoRobot.setWheel("create robot Wheel success!");
    }

    public LegoRobot getLegoRobot(){
        return legoRobot;
    }
}
