package org.acme.model;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;


@Embeddable
public class Dog {


    @Embedded
    private Owner owner;

    @Embedded
    private Address pickup_address;

    private String dogName;
    private String breed;
    private LocalDate desiredPeriod;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDesiredPeriod() {
        return desiredPeriod;
    }

    public void setDesiredPeriod(LocalDate desiredPeriod) {
        this.desiredPeriod = desiredPeriod;
    }
}
