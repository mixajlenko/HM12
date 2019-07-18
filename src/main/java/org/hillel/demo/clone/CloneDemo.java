package org.hillel.demo.clone;

public class CloneDemo {

    public static void main(String[] args) {
        Address adress = new Address("Dnipro", "Lazaryana", 2);
        User user1 = new User("Oleh", "Petrenko", 20, adress);
        User user2 = new User("Dmitro", "Haritonov", 22, adress);
        User user3 = null;
        User user4 = new User(user2);

        try {
            user3 =  user1.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(user1.getAddress().getStreet());
        System.out.println(user3.getAddress().getStreet());
        user3.getAddress().setStreet("ololo");
        System.out.println(user1.getAddress().getStreet());
        System.out.println(user3.getAddress().getStreet());
        System.out.println(user2);
        System.out.println(user4);
    }
}
