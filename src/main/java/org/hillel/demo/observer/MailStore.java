package org.hillel.demo.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MailStore implements MailPublisher {

    private Map<MailType, Set<Observer>> observers = new HashMap<>();

    @Override
    public void subscribe(MailType event, Observer observer) {
        Set<Observer> observers_;
        if (!observers.containsKey(event)) {
            observers_ = new HashSet<>();
            observers.put(event, observers_);
        } else {
            observers_ = observers.get(event);
        }
        observers_.add(observer);
    }

    @Override
    public void notify(MailType event) {
        if (observers.containsKey(event)) {
            observers.get(event).forEach(new Consumer<Observer>() {
                @Override
                public void accept(Observer o) {
                    o.react(event, this);
                }
            });
        }
    }

    @Override
    public void unsubscribe(MailType event, Observer observer) {
        if (observers.containsKey(event)) {
            observers.get(event).remove(observer);
        }
    }
}
