package org.example.exo6.entity;

import java.time.LocalDate;

public class Car {

    private int id;
    private String brand;
    private LocalDate fabricationDate;
    private String color;

    public Car() {}

    public Car(int id, String brand, LocalDate fabricationDate, String color) {
        this.id = id;
        this.brand = brand;
        this.fabricationDate = fabricationDate;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
