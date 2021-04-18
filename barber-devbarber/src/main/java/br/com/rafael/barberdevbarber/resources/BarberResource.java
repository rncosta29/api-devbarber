package br.com.rafael.barberdevbarber.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.barberdevbarber.dto.BarberDTO;
import br.com.rafael.barberdevbarber.entities.Barber;
import br.com.rafael.barberdevbarber.services.BarberService;

@RestController
@RequestMapping(path = "/barber")
public class BarberResource {

	@Autowired
	private BarberService service;
	
	@GetMapping(path = "")
	public ResponseEntity<List<Barber>> showBarbers() {
		List<Barber> list = service.findAll();
		
		return ResponseEntity.ok(list);
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public ResponseEntity<Barber> create(@RequestBody BarberDTO barberdto) {
		Barber barber = new Barber(barberdto);
		service.insert(barber);
		
		return ResponseEntity.ok().body(barber);
	}
}
