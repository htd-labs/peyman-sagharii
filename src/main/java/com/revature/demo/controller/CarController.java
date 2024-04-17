package com.revature.demo.controller;

import com.revature.demo.model.CarModel;
import com.revature.demo.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarServices carServices;
    @Autowired
    public CarController(CarServices carServices) {
        this.carServices = carServices;
    }



    @PostMapping
    public CarModel createCar(@RequestBody CarModel carModel){

        return carServices.createCar(carModel);
    }

    @GetMapping
    public List<CarModel> getAllCars(){
        return carServices.getAllCars();
    }

    @GetMapping("{id}")
    public CarModel getCarById(@PathVariable int id){
        return carServices.getCarById(id);
    }

}
