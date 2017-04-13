package com.melodymoselle.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.melodymoselle.mvc.data.entities.Project;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String goHome(Model model){
		
		Project project = new Project();
		project.setName("First Project");
		project.setSponsor("Nasa");
		project.setDescription("This is a simple project sponsored by Nasa.");
		
		model.addAttribute("currentProject", project);
		
		return "home";
	}
}
