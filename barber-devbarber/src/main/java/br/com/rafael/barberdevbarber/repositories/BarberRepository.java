package br.com.rafael.barberdevbarber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.barberdevbarber.entities.Barber;

@Repository
public interface BarberRepository extends JpaRepository<Barber, Long> {

}
