package test;

import service.Sender;
import service.impl.EmailSender;
import service.impl.SmsSender;

/**
 * @auther XJ-PC xj
 * @create 2018-8-716:50
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new EmailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            return null;
        }
    }

    public SmsSender produceSms(){
        return new SmsSender();
    }
    public EmailSender produceEmail(){
        return new EmailSender();
    }

    public static EmailSender produceStaticEmail(){
        return new EmailSender();
    }
}
