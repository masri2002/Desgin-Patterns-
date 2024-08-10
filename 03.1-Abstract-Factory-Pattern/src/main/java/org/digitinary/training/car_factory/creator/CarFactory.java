package org.digitinary.training.car_factory.creator;

import org.digitinary.training.car_factory.product.Car;
import org.digitinary.training.car_factory.product.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
    void carSpecification();

}
