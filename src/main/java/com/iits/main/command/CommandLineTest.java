package com.iits.main.command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.iits.main.entity.Address;
import com.iits.main.entity.User;
import com.iits.main.repository.AddressRepository;
import com.iits.main.repository.UserRepository;

@Component
public class CommandLineTest implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
		 Address address = new Address();
		 address.setStreet("abc");
		 address.setCity("xyz");
		 //this.addressRepository.save(address);
		 
		 User user =new User();
		 user.setUsername("imtiaz");user.setPassword("imtiaz123");user.setAddress(address);
		 this.userRepository.save(user);
	}
}
