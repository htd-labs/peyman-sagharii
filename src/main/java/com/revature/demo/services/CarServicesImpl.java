package com.revature.demo.services;

import com.revature.demo.model.CarModel;
import com.revature.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServicesImpl implements CarServices{


    private CarRepository carRepository;
    @Autowired //This tells to spring to wire
    public CarServicesImpl(CarRepository carRepository) {
        this.carRepository = carRepository;

        // we need a method called upon by controller and that method talk with repository
    }
    @Override
    public CarModel getCarById(int id) {
        return carRepository.findCarById(id);
    }

    @Override
    public CarModel getCarByModel(String model) {
        return carRepository.findCarByModel(model);
    }

    public List<CarModel> getAllCars(){
        return carRepository.findAll();
    }
    public CarModel createCar(CarModel carModel){
        return carRepository.save(carModel);
    }
}
