package br.com.rafael.barberdevbarber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rafael.barberdevbarber.entities.Barber;
import br.com.rafael.barberdevbarber.interfaces.IBarberService;
import br.com.rafael.barberdevbarber.repositories.BarberRepository;

public class BarberService implements IBarberService {

	@Autowired
	private BarberRepository repository;
	
	@Override
	public List<Barber> findAll() {
		List<Barber> list = repository.findAll();
		return list;
	}

	@Override
	public Barber insert(Barber barber) {
		return repository.save(barber);
	}

}
