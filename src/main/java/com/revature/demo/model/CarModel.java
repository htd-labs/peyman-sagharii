package com.revature.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="cars")
    private int id;
    @Column(nullable = false)
    private String make;
    @Column(nullable = false, unique = true)
    private String model;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private String  color;

    public CarModel() {
    }

    public CarModel(int id, String color, int year, String model, String make) {
        this.id = id;
        this.color = color;
        this.year = year;
        this.model = model;
        this.make = make;
    }

    public CarModel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
