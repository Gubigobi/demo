package Bridge;

/**
 * @auther XJ-PC xj
 * @create 2018-8-914:29
 */
public class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }
}
