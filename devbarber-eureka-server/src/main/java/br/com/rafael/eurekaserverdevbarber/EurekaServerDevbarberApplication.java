package br.com.rafael.eurekaserverdevbarber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerDevbarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerDevbarberApplication.class, args);
	}

}
