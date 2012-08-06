package com.hopcroft.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.hopcroft.example.car.Car;
// car service
@Path("car")
public class CarResource {
	@GET
	public Car getCar() {
		Car car = new Car();
		car.setBrand("Ferrari");
		car.setModel("F40");
		car.setPrize(1000000);
		car.setYear(1995);
		return car;
	}
}
