package Builder;

/**
 * @auther XJ-PC xj
 * @create 2018-8-1014:27
 */
public class Director {
    public RobotBuilder robotBuilder;

    public  Director(){

    }
    public  Director(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public void createRobor(){
        //先造head -->hand -->body -->wheel
        robotBuilder.createHead();
        robotBuilder.createHand();
        robotBuilder.createBody();
        robotBuilder.createWheel();

    }
}
