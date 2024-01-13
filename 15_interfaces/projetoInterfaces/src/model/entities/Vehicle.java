package model.entities;

import java.util.Objects;

public class Vehicle {

    private String model;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
