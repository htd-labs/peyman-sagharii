package com.revature.demo.services;

import com.revature.demo.model.CarModel;

import java.util.List;

public interface CarServices {
    List<CarModel> getAllCars();
    CarModel getCarById(int id);
    CarModel createCar(CarModel car);
    CarModel getCarByModel(String model);
}
