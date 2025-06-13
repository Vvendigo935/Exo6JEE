package org.example.exo6.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exo6.entity.Car;

import java.time.LocalDate;
import java.util.List;


@ApplicationScoped

public class CarService {

    public Car save(int id, String brand, LocalDate fabricationDate, String color) {
        return new Car(id, brand, fabricationDate, color);
    }
//    public Car update(Car car) {
//
//        return car(id, brand, fabricationDate, color);
//    }
//    public Car getAllCar(){
//        return List<Car> cars;
//    }

}
