package pl.sda.restdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.restdemo.entity.Car;
import pl.sda.restdemo.service.CarService;

import java.net.URI;
import java.util.List;

// CRUD
// Read - GET /moje-auta
// Read - GET /moje-auta/{id} - one car
// Read - GET /moje-auta/{id}/engine/....
// Create - POST /moje-auta
// Delete - DELETE /moje-auta/{id}
// Update - PUT (full)/PATCH (partial update) /moje-auta/{id}

@RestController
@RequestMapping("/rest")
public class CarRestController {

    private static final Logger logger = LoggerFactory.getLogger(CarRestController.class);
    private final CarService carService;

    @Autowired
    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/moje-auta")
    public List<Car> myCars() {
        return carService.myAllCars();
    }

    @GetMapping(value = "/moje-auta/{id}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Car getCarById(@PathVariable("id") Long idik) {
        logger.info("find car by id: [{}]", idik);
        // TODO: implement
        return new Car();
    }

    @PostMapping("/moje-auta")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Car> addNewCar(@RequestBody Car carToSave) {
        logger.info("received car to save: [{}]", carToSave);
        // TODO: save car
//        return ResponseEntity
//            .ok()
//            .body(new Car());
        long newCarId = 5L;
        return ResponseEntity
            .created(URI.create(String.format("/moje-auto/%d", newCarId)))
            .body(new Car());
    }

    @DeleteMapping("/moje-auta/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCarById(@PathVariable("id") Long id) {
        logger.info("delete car by id: [{}]", id);
        // TODO: delete object by id

    }
}
