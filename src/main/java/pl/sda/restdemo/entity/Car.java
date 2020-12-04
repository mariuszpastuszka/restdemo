package pl.sda.restdemo.entity;

import java.util.Objects;

public class Car {

    private Long id; // { get, set } car.id = 5; id = car.id
    private String brand;
    private String model;
    private String fuelKind;
    private String color;

    //
//    private String problem;
//    public String getNoProblem() {
//        return problem;
//    }
    //
    public Car() {
    }

    public Car(Long id, String brand, String model, String fuelKind, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fuelKind = fuelKind;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelKind() {
        return fuelKind;
    }

    public void setFuelKind(String fuelKind) {
        this.fuelKind = fuelKind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) &&
            Objects.equals(brand, car.brand) &&
            Objects.equals(model, car.model) &&
            Objects.equals(fuelKind, car.fuelKind) &&
            Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, fuelKind, color);
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", fuelKind='" + fuelKind + '\'' +
            ", color='" + color + '\'' +
            '}';
    }
}
