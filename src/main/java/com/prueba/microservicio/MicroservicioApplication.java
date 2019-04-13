package com.prueba.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApplication.class, args);
	}
	
	@RequestMapping("saludar")
	public String saludar(){
		System.out.println("agregamos una nueva linea de prueba");
		System.out.println("agregamos una segunda linea de prueba");
		return "Hoooooola Mundo!!!!!";
	}

}
