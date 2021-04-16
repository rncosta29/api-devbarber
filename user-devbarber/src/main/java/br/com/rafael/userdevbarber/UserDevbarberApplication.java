package br.com.rafael.userdevbarber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserDevbarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDevbarberApplication.class, args);
	}

}
