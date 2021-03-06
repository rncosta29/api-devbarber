package br.com.rafael.userdevbarber.interfaces;

import java.util.List;

import br.com.rafael.userdevbarber.entities.User;

public interface IUserService {

	List<User> findAll();
	User findByEmail(String email);
	User findById(Long id);
	User insert(User user);
	void toCheckEmail(String email);
}
