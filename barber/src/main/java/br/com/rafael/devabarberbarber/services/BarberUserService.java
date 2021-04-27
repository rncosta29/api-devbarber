package br.com.rafael.devabarberbarber.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.devabarberbarber.feignclients.UserFeignClient;
import br.com.rafael.devabarberbarber.model.Barber;
import br.com.rafael.devabarberbarber.model.User;

@Service
public class BarberUserService {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public Barber getUser(long id) {
		User user = userFeignClient.findById(id).getBody();
		Barber barber = new Barber(user.getName(), "default.png", 3.9, "-23.56017", "-46.65779");
		return barber;
	}
}
