package com.cts.training.middle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.training.dao.SectorDAO;

//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.cts.training.bean.Sector;
//import com.cts.training.dao.SectorDAO;
//
//
//
//
//@Controller
//public class SectorController {
//	@Autowired
//	SectorDAO sectorDAO;
//	@GetMapping("/sector-home")
//	public String userpage(Model model)
//	
//	{
//		List<Sector> sectors=sectorDAO.displayAllSectors();
//		model.addAttribute("list", sectors);
//		model.addAttribute("sector",new Sector());
//		
//		return "sector";
//		
//	}
//	@PostMapping("/user/save")
//	
//	public String addSector(@ModelAttribute("sector") Sector sector)
//	{
//		sectorDAO.saveOrUpdateCompany(sector);
//		return"redirect:/setor-home";
//	}
//@GetMapping("/remove8/{id}")
//	public String deleteSector(@PathVariable("id")int id)
//	{
//	Sector sector =sectorDAO.getSectorById(id);
//	sectorDAO.removeSector(sector);
//	return "redirect:/sector-home";	
//	}
//
//@GetMapping("/update8/{id}")
//public String updateSector(@PathVariable("id") int id,Model model) {
//	Sector sector=sectorDAO.getSectorById(id)
//	List<Sector>  sectors=sectorDAO.
//	model.addAttribute("list", sectors);
//	model.addAttribute("sector", sector);
//	return "sector";
//}
//}
//
//
@Controller
public class SectorController {
	@Autowired
	SectorDAO sectorDAO;
	@GetMapping("/sector-home")
	public String sectorPage(Model model)
	{
		List<Sector>
	
}

}