package org.acme.model;


import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "owner")
@SecondaryTable( name = "home_address", pkJoinColumns = @PrimaryKeyJoinColumn(name ="OWN_ID"))
@ApplicationScoped
public class Owner {

    @Id
    @GeneratedValue(strategy=AUTO)
    @Column(name="OWN_ID")
    private int id;


    @Embedded
    @Column(table = "home_address")
    private Address home_address;

    public Address getHome_address() {
        return home_address;
    }

    public void setHome_address(Address home_address) {
        this.home_address = home_address;
    }
    


    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
