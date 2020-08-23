package com.project.cars.service;

import com.project.cars.entity.Car;

import java.util.List;

public interface ICarsService {

    void addNewCar(Car newCar);
    List<Car> getAllCars();
    Car getCarByColor(String color);
}

