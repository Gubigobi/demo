package test;

import org.junit.Test;
import service.Sender;
import service.impl.EmailSender;
import service.impl.SmsSender;

/**
 * Created by XJ-PC on 2018-8-7.
 */
public class FactoryTest {
    /**
     * 工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建
     * @throws Exception
     */
    @Test
    public void produce() throws Exception {
        SendFactory sendFactory = new SendFactory();
        //1
        Sender sender = sendFactory.produce("sms");
        sender.send();
        System.out.println();
        //2
        EmailSender emailSender = sendFactory.produceEmail();
        emailSender.send();
        System.out.println();
        //静态工厂模式，优先选择此种方式创建对象
        EmailSender emailSenderStatic = SendFactory.produceStaticEmail();
        emailSenderStatic.send();
    }



}
