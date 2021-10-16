package com.example.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);

		Car tesla = new Car();
		tesla.setModel("Model S");
		tesla.setFelgi("18' alumioniowe");
		tesla.setKolor("Biały");
		tesla.setPojemnośćSilnika(1495);
		tesla.setSkrzynia("automatyczna");
		tesla.setTapiceka("Skóra");
		tesla.setWyposażenie("Sport");
		tesla.setTyp("Sedan");

		System.out.println(tesla);
	}





}
