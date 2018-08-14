package Singleton;

import java.security.Signature;

/**
 * 单例模式
 *
 * @auther XJ-PC xj
 * @create 2018-8-811:02
 */
public class Singleton {
    private Singleton(){

    }
    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }
    private static Singleton getInstance(){
        return SingletonFactory.instance;
    }
}
