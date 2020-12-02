package pl.sda.restdemo.service;

import org.springframework.stereotype.Service;
import pl.sda.restdemo.entity.Car;
import pl.sda.restdemo.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // TODO: change into DTOs
    public List<Car> myAllCars() {
        return carRepository.getMyCars();
    }
}
