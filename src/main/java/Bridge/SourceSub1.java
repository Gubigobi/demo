package Bridge;

/**
 * @auther XJ-PC xj
 * @create 2018-8-914:26
 */
public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
