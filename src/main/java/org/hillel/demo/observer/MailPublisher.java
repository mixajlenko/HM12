package org.hillel.demo.observer;

public interface MailPublisher {

    void subscribe(MailType event, Observer observer);

    void notify(MailType event);

    void unsubscribe(MailType event, Observer observer);
}
