package br.com.rafael.barberdevbarber.interfaces;

import java.util.List;

import br.com.rafael.barberdevbarber.entities.Barber;

public interface IBarberService {

	List<Barber> findAll();
	Barber insert(Barber barber);
}
