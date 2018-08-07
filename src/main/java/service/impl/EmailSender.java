package service.impl;

import service.Sender;

/**
 * @auther XJ-PC xj
 * @create 2018-8-716:47
 */
public class EmailSender implements Sender{
    @Override
    public void send() {
        System.out.print("Email Send");
    }
}
