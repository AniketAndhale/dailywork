package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.models.Users;
import com.cts.project.repo.UsersRepo;

@CrossOrigin("*")
@RestController
public class UsersRestServiceController {
	
	@Autowired
	UsersRepo ur;
	
	@Autowired
	JavaMailSender jms;
	@GetMapping("/users")
	public List<Users> findAll() {
		return ur.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Users findOne(@PathVariable int id) {
		Optional<Users> usr = ur.findById(id);
		Users us = usr.get();
		return us;
	}
	
	@PostMapping("/users")
	public Users save(@RequestBody Users usr) {
		Users us = ur.save(usr);
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("aniketandhale3648@gmail.com");
			sm.setTo("aniketandhale3648@gmail.com");
			sm.setSubject("testing mail...");
			sm.setText("this is the testing mail....");
			sm.setText("Account created click on <a href='http://localhost:4200/activate?"+us.getEmail()
			+"'>Click</a>");
			jms.send(sm);
			us.setRegStatus("ok");
			System.out.println("sending mail...");			
		}
		catch (Exception e){
			e.printStackTrace();
		}	
		
		return us;
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/users")
	public Users update(@RequestBody Users usr) {
		Users us = ur.save(usr);
		
		return us;
	}

	@PutMapping(value="/users/activate")
	public String activateUser(@RequestBody String e) {
		
		String temp = e.split(":")[1];
		String email=temp.split("\"")[1];
		System.out.println("activate::: "+email);
		Users user = ur.findByEmail(email);
		if(user.getActive().equals("no")) {
			user.setActive("yes");
			ur.save(user);
			return "{\"result\":\"1\"}";
		}
		else
		return "{\"result\":\"0\"}";
	}
}
