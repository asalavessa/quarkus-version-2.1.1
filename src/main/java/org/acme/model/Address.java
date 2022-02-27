package org.acme.model;


import javax.persistence.*;


@Embeddable
public class Address {


    @Column(name = "street", table = "home_address")
    private String street;

    @Column(name = "number", table = "home_address")
    private int number;

    @Column(name = "zipCode", table = "home_address")
    private String zipCode;

    @Column(name = "country", table = "home_address")
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
