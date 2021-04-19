package br.com.rafael.barberdevbarber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BarberDevbarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberDevbarberApplication.class, args);
	}

}
