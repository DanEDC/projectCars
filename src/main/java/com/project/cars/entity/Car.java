package com.project.cars.entity;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;

    public Car() {

    }

    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
