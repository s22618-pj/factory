package com.example.factory;

public class CarService {

    public void print (Car car){

        System.out.println(car);
    }
public void addExtraWheel(int wheels) {
        if (car.getWheels() < 5) {
            car.setWheels(car.getWheels() + 1)
        }
}

}