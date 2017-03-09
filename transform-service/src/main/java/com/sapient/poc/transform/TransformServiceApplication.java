package com.sapient.poc.transform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("applicationContext.xml")
public class TransformServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransformServiceApplication.class, args);
	}
}
