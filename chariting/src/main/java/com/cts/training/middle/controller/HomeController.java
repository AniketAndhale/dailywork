
  package com.cts.training.middle.controller;
  
  import java.util.ArrayList; import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.ui.Model; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.RequestMapping;

  import com.cts.training.bean.Company; import com.cts.training.bean.User;
  import com.cts.training.dao.CompanyDAO; import com.cts.training.dao.UserDAO;
  
  @Controller public class HomeController {
 
  @Autowired private UserDAO UserDAO;
  
  @Autowired private CompanyDAO CompanyDAO;
  
  @GetMapping("/user")
  
   public String indexpage(Model model) { List<User>
  users=UserDAO.getAllUsers(); model.addAttribute("list", users); 
  return "user";
  
  }
  
  
  @GetMapping("/company")
  public String companypage(Model model) {
  List<Company> companies=CompanyDAO.getAllCompanies();
  model.addAttribute("list", companies); 
  return "company"; 
  
  }
  }