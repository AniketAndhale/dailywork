package com.cts.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.UserDAO;
import com.cts.training.model.Configuration;
@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categoryfDAO;

	@GetMapping("/category")
	public String CategoryPage(Model model) {
		List<Category> categories = categoryDAO.getAllCategories();
		model.addAttribute("list", categories);
		model.addAttribute("category", new Category());
		return "category";
	}

	@PostMapping("/category/save")
	// OR
//	@RequestMapping(value="/category/save" , method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category) {
		categoryDAO.saveOrUpdateCategory(category);
		return "redirect:/category";
	}

	@GetMapping("/removecategory/{categoryId}") // {}->path variable
	public String deleteCategory(@PathVariable("categoryId") int categoryId) {
		Category category = categoryDAO.getUserById(categoryId);
		categoryDAO.deleteCategory(category);
		return "redirect:/category";
	}

	@GetMapping("/updatecategory/{categoryId}")
	public String updateCategory(@PathVariable("categoryId") int categoryId, Model model) {
		Category category = categoryDAO.getCategoryById(categoryId);
		model.addAttribute("category", category);
		List<Category> categories = categoryDAO.getAllcategories();
		model.addAttribute("list", categories);
		return "category";
	}

}
