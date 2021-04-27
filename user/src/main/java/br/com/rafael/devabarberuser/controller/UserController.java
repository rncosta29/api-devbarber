package br.com.rafael.devabarberuser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.devabarberuser.model.User;
import br.com.rafael.devabarberuser.repositories.UserRepository;

@RefreshScope
@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private Environment env;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = repository.findAll();
		return ResponseEntity.ok(list);
	}	

	@GetMapping(path = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = repository.findById(id).get();
		logger.info("PORT: = " + env.getProperty("local.server.port"));
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping(path = "add")
	public ResponseEntity<User> create(@RequestBody User user) {
		repository.save(user);
		return ResponseEntity.ok(user);
	}
}
