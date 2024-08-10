package org.digitinary.training.car_factory.creator;

import org.digitinary.training.car_factory.product.Car;
import org.digitinary.training.car_factory.product.CarSpecification;
import org.digitinary.training.car_factory.product.EuropeSpecification;
import org.digitinary.training.car_factory.product.Hatchback;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }

    @Override
    public void carSpecification() {
        System.out.println("EuropeCarFactory");
    }
}
