package com.cts.training.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	
		@Autowired
		UsersRepo userrepo;
		@Autowired
		JavaMailSender jms;
		@Override
		public String insert(Users user) {
			Users users = new Users();
			String b;
			try {
				SimpleMailMessage simplemail = new SimpleMailMessage();
				simplemail.setFrom("aniketandhale3648@gmail.com");
				simplemail.setTo(users.getEmail());
				b=users.getEmail();
				if(users.findByEmail(b) != null) {
					return"{\"res\":\"0\"}";
				}
				else {
					BeanUtils.copyProperties(users, users);
					userrepo.save(user);
					simplemail.setSubject("Testing Mail");
					simplemail.setText("Account created click on 'http://localhost:5400/activate?" + users.getEmail()+ "'");
					jms.send(simplemail);
					return "{\"res\":\"1\"}";
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				return"{\"res\":\"2\"}";
			}
		}

		
		@Override
		public void remove(int id) {
			userrepo.deleteById(id);
		}
		@Override
		public List<Users> getAll() {
			return userrepo.findAll();
		}
		@Override
		public Users getOne(int id) {
			Optional<Users> users = userrepo.findById(id);
			Users users1 = users.get();
			return users1;
		}
		@Override
		public String alter(Users users) {
			Users users1 = new Users();
			BeanUtils.copyProperties(users, users1);
			users1=userrepo.save(users1);
			if(users1!=null) {
			return "{\"res\":\"1\"}";}
			else {
				return "{\"res\":\"0\"}";
			}
		}
	}
		
		



