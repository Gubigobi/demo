package service.impl;

import service.Provider;
import service.Sender;

/**
 * @auther XJ-PC xj
 * @create 2018-8-717:25
 */
public class EmailFactory implements Provider{

    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
