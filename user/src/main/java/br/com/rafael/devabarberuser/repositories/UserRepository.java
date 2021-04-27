package br.com.rafael.devabarberuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.devabarberuser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
