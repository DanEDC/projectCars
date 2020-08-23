package com.project.cars.service;

import com.project.cars.entity.Car;
import com.project.cars.repository.ICarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarsService implements ICarsService {

    @Autowired
    private ICarsRepository repo;

    public CarsService(ICarsRepository repo) {
        this.repo = repo;
    }

    @Override
    public void addNewCar(Car newCar) {
        repo.save(newCar);

    }

    @Override
    public List<Car> getAllCars() {
        return repo.findAll();
    }

    @Override
    public Car getCarByColor(String color) {
        List<Car> allCars = repo.findAll();
        for(Car car : allCars) {
            if(car.getColor().equals(color)) {
                return car;
            }
        }
        return null;
    }
}
