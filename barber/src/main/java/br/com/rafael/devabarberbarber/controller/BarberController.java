package br.com.rafael.devabarberbarber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.devabarberbarber.model.Barber;
import br.com.rafael.devabarberbarber.repository.BarberRepository;
import br.com.rafael.devabarberbarber.services.BarberUserService;

@RestController
@RequestMapping(path = "/barber")
public class BarberController {

	@Autowired
	private BarberRepository repository;
	
	@Autowired
	private BarberUserService service;
	
	@GetMapping(path = "")
	public ResponseEntity<List<Barber>> findAll() {
		List<Barber> list = repository.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Barber> findById(@PathVariable Long id) {
		Barber barber = repository.findById(id).get();
		return ResponseEntity.ok(barber);
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public ResponseEntity<Barber> create(@RequestBody Barber barber) {
		repository.save(barber);
		
		return ResponseEntity.ok().body(barber);
	}
	
	@GetMapping(path = "/teste/{id}")
	public ResponseEntity<Barber> findByUser(@PathVariable Long id) {
		Barber barber = service.getUser(id);
		return ResponseEntity.ok(barber);
	}
}
