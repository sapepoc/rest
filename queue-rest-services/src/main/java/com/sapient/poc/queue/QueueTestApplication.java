package com.sapient.poc.queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("applicationContext.xml")
public class QueueTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueTestApplication.class, args);
	}
}
