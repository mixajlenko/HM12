package org.hillel.demo.observer;

public class MailDemo {
    public static void main(String[] args) {

        Observer observer1 = new MailListener();
        Observer observer2 = new MailListener();
        MailType event = new MailType("event3");

        MailPublisher publisher = new MailStore();
        publisher.notify(event);

        publisher.subscribe(event, observer1);
        publisher.subscribe(event, observer2);

        publisher.notify(event);
        publisher.notify(new MailType("event2"));

        publisher.unsubscribe(event, observer2);
        publisher.notify(new MailType("event1"));
    }
}
