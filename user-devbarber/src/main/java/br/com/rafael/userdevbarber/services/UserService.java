package br.com.rafael.userdevbarber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.userdevbarber.entities.User;
import br.com.rafael.userdevbarber.exception.ObjectNotFoundException;
import br.com.rafael.userdevbarber.interfaces.IUserService;
import br.com.rafael.userdevbarber.repositories.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAll() {
		List<User> list = repository.findAll();
		return list;
	}

	@Override
	public User findByEmail(String email) {
		User user = repository.findByEmail(email);
		
		if(user == null) {
			throw new ObjectNotFoundException("E-mail não encontrado");
		}
		
		return user;
	}

	@Override
	public User findById(Long id) {
		User user = repository.findById(id).get();
		
		if(user == null) {
			throw new ObjectNotFoundException("Usuário não encontrado");
		}
		return user;
	}

	@Override
	public User insert(User user) {
		return repository.save(user);
	}

	@Override
	public void toCheckEmail(String email) {
		User user = repository.findByEmail(email);
		
		if(user.getEmail().contains(email)) {
			throw new ObjectNotFoundException("E-mail ja está cadastrado");
		}
	}

}
