package org.hillel.demo.observer;

public class MailListener implements Observer {
    @Override
    public void react(MailType event, Object data) {
        System.out.println("Event " + event + " was triggered");

    }
}
