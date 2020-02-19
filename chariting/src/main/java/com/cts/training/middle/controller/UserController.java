package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;

@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;
	@GetMapping("/user-home")
	public String userpage(Model model)
	
	{
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list", users);
		model.addAttribute("user",new User());
		
		return "users";
		
	}
	@PostMapping("/user/save")
	
	public String adduser(@ModelAttribute("user") User user)
	{
		userDAO.saveOrUpdateUser(user);
		return"redirect:/user-home";
	}
@GetMapping("/remove/{id}")
	public String deleteuser(@PathVariable("id")int id)
	{
	User user =userDAO.getUserById(id);
	userDAO.removeUser(user);
	return "redirect:/user-home";	
	}

@GetMapping("/update/{id}")
public String updateUser(@PathVariable("id") int id,Model model) {
	User user=userDAO.getUserById(id);
	List<User>  users=userDAO.getAllUsers();
	model.addAttribute("list", users);
	model.addAttribute("user", user);
	return "users";
}
}
