package pl.sda.restdemo.repository;

import org.springframework.stereotype.Repository;
import pl.sda.restdemo.entity.Car;

import java.util.List;

@Repository
public class CarRepository {

    public List<Car> getMyCars() {
        return List.of(
            new Car(1L, "BMW", "7", "Gaz", "Black"),
            new Car(2L, "BMW", "3", "LPG", "Red")
        );
    }
}
