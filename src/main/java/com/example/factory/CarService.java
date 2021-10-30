package com.example.factory;

@Service
public class CarService {

    public Car buildCar(String model, String marka ){
        Car car = new Car(marka, wheels:4, model, pojemnośćSilnika:1000)
    }




    public void print(Car car) {

        System.out.println(car);
    }

    public void addExtraWheel(Car car) {
        if (car.getWheels() < 5) {
            car.setWheels(car.getWheels() + 1);
        }
    }

}
