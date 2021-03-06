package br.com.rafael.userdevbarber.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.userdevbarber.dto.Data;
import br.com.rafael.userdevbarber.entities.User;
import br.com.rafael.userdevbarber.interfaces.IUserService;

@RestController
@RequestMapping(path = "user")
public class UserResource {

	@Autowired
	private IUserService service;
	
	@GetMapping(path = "")
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = service.findById(id);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping(path = "/add")
	public ResponseEntity<Data> addUser(@RequestBody User user){
		
		String encodedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		Data data = new Data();
		
		user.setActive(true);
		user.setAvatar("https://api.b7web.com.br/devbarber/media/avatars/default.png");
		user.setInsertedDate(new Date());

		service.toCheckEmail(user.getEmail());
		
		
		//MyUserDetails userDetails = new MyUserDetails(user);
		
		service.insert(user);
		
		//final String token = jwtTokenUtil.generateToken(userDetails);
		
		data.setErrors("");
		data.setData(user);
		//data.setToken(token);
				
		return ResponseEntity.ok(data);
	}
}
