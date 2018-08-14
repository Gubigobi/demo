package Adapter;

import java.nio.file.Watchable;

/**
 * 对象的适配器模式
 * @auther XJ-PC xj
 * @create 2018-8-814:28
 */
public class Wrapper implements Targetable{
    private Source source;

    public Wrapper(){

    }
    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
