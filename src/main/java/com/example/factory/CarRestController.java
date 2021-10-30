package com.example.factory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarRestController {

    public final CarRestController(CarService carService){
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<String> printHelloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/build")
    public ResponseEntity<Car> getCar(){
        return Response.ok(carService.build(make: "Subaru", model: "Forester"))
    }

    //ResponseEntity
    //H2database
}
