package br.com.rafael.barberdevbarber.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	private BarberService barberService;

	@RequestMapping(path = "/random", method = RequestMethod.POST)
	public ResponseEntity<Barber> create(@RequestBody BarberDTO barberdto) {
		Barber barber = new Barber(barberdto);
		barberService.insert(barber);
		
		return ResponseEntity.ok().body(barber);
	}
}
