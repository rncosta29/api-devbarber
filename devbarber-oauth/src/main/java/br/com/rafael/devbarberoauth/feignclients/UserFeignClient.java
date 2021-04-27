package br.com.rafael.devbarberoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.rafael.devbarberoauth.entities.User;

@Component
@FeignClient(name = "devbarber-user", path = "/user")
public interface UserFeignClient {

	@GetMapping(path = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);
}
