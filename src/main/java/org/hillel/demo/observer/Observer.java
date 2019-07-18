package org.hillel.demo.observer;

    public interface Observer {
        void react (MailType event, Object data);
    }

