package br.com.rafael.devbarberoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class OauthDevbarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthDevbarberApplication.class, args);
	}

}
