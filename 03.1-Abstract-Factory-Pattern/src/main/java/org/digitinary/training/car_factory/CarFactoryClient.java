package org.digitinary.training.car_factory;

import org.digitinary.training.car_factory.creator.CarFactory;
import org.digitinary.training.car_factory.creator.EuropeCarFactory;
import org.digitinary.training.car_factory.creator.NorthAmericaCarFactory;
import org.digitinary.training.car_factory.product.Car;
import org.digitinary.training.car_factory.product.CarSpecification;

public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory carFactory=new EuropeCarFactory();
        Car car=carFactory.createCar();
        CarSpecification specification = carFactory.createSpecification();
        car.assemble();
        specification.display();
        System.out.println("-----------------------------------------\n\n");
        CarFactory carFactory2=new NorthAmericaCarFactory();
        Car car2=carFactory2.createCar();
        car2.assemble();
        CarSpecification specification2=carFactory2.createSpecification();
        specification2.display();
    }
}
