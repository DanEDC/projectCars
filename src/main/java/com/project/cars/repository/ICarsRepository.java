package com.project.cars.repository;

import com.project.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarsRepository extends JpaRepository<Car, Integer> {

}
