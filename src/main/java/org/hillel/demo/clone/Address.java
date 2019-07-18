package org.hillel.demo.clone;

public class Address {

   private String city;
   private String street;
   private int house;

    public Address(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
