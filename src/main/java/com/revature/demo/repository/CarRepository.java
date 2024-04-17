package com.revature.demo.repository;

import com.revature.demo.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel,Integer> {


    CarModel findCarByModel(String model);
    CarModel findCarById(int id);
}
