package br.com.rafael.devabarberbarber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.devabarberbarber.model.Barber;

@Repository
public interface BarberRepository extends JpaRepository<Barber, Long> {

}
