package Decorator;

/**被装饰对象
 * @auther XJ-PC xj
 * @create 2018-8-815:59
 */
public class Source implements Sourceable{
    @Override
    public void method1() {
        System.out.println("=======method1=======");
    }
}
