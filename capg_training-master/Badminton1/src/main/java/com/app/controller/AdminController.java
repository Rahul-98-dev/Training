package com.app.controller;

import java.sql.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.MatchEvent;

import com.app.service.MatchService;





@Controller
@RequestMapping("/admin")
public class AdminController{
	@Autowired
	private MatchService matchService;
	
	
	@GetMapping("/dashboard2")
	public String showDashboard() {
		return "dashboard2";
	}
	@GetMapping("/addevent")
	public String addEventForm(Model model) {
		MatchEvent event = new MatchEvent();	
		model.addAttribute("event", event);
		return "addevent";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveMatchEvent(@ModelAttribute("event") MatchEvent event) {
		matchService.saveMatchEvent(event);	
		return "addevent";
		
		
			
			
	}	
	

}

