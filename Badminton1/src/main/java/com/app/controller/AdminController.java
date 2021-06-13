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

import com.app.entity.Admin;
import com.app.entity.MatchEvent;

import com.app.service.MatchService;

@Controller

public class AdminController{
	@Autowired
	private MatchService matchService;
//	---------------home page----------------
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping("/gameinfo")
	public String gameInfo() {
		return "gameinfo";
	}
	
//	----------------Admin Sign In-----------------------
	@RequestMapping("/admin_sign_in")
	public String showForm(Model model) {		
		Admin user = new Admin();		
		model.addAttribute("user",user);
		return "admin";
	}
	
//	-----------dashboard 2 call from admin-------------------
	@RequestMapping(value="showdashboard",method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("user")  Admin user, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "admin";
		}
		return "dashboard2";		
	}
	
	@GetMapping("/dashboard2")
	public String showDashboard2() {
		return "dashboard2";
	}
//	@GetMapping("/dashboard")
//	public String showDashboard() {
//		return "dashboard";
//	}
	
// ---------------------Operations of Dashboard begin------------------------

//	--------------1. schedule Match or addEvent begin----------------------
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

