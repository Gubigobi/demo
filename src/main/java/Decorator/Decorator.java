package Decorator;

/**
 * 装饰模式
 * 装饰对象持有被装饰对象实例
 * @auther XJ-PC xj
 * @create 2018-8-815:57
 */
public class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(){
        super();
        this.source = new Source();
    }

    @Override
    public void method1() {
        System.out.println("===start===");
        source.method1();
        System.out.println("===end===");

    }
}
