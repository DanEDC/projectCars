package com.project.cars.controller;

import com.project.cars.entity.Car;
import com.project.cars.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {

    @Autowired
    private CarsService carsService;

    @PostMapping(value = "/cars/save")
    public String saveCar(@RequestBody Car car) {
        carsService.addNewCar(car);
        String msg = String.format("Added to repository car:\nType: %S\nModel: %s\nColor: %s", car.getType(), car.getModel(), car.getColor());
        return msg;
    }

    @GetMapping(value = "/cars")
    public List<Car> getAllCars() {
        return carsService.getAllCars();
    }

    @GetMapping(value = "/cars/{color}")
    public Car getCarByColor(@PathVariable(value = "color") String color) {
        return carsService.getCarByColor(color);
    }


}
