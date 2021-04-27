package br.com.rafael.devabarberbarber.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.rafael.devabarberbarber.model.User;

@Component
@FeignClient(name = "user", path = "/user")
public interface UserFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<User> findById(@PathVariable Long id);
}
