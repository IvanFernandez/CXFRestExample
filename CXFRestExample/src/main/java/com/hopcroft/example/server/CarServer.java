package com.hopcroft.example.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.hopcroft.example.service.CarResource;

public class CarServer {
	public static void main(String[] args) {
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(CarResource.class);
		sf.setAddress("http://localhost:8080/");
		sf.create();
	}

}
