package Adapter;

/**
 * 类的适配器模式
 * @auther XJ-PC xj
 * @create 2018-8-814:20
 */
public class Adapter  extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
