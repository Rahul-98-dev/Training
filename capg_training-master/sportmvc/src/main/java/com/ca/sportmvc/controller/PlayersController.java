package com.ca.sportmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ca.sportmvc.bean.Admin;
import com.ca.sportmvc.entity.Players;
import com.ca.sportmvc.service.PlayersService;

@Controller
public class PlayersController {
	
	@Autowired
	private PlayersService playersService;
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/register")
	public String playersRegistration() {
		
		return "register";
	}
	@RequestMapping(value="/savePlayer",method = RequestMethod.POST)
	public String playerRegistered(@ModelAttribute Players players) {
		playersService.savePlayer(players);
		return "registrationSuccessful";
	}
	
	@RequestMapping("/admin")
	public String showForm(Model model) {		
		Admin user = new Admin();		
		model.addAttribute("user",user);
		return "admin";
	}
     
	@RequestMapping(value="/xcvbnm$zxcvbnm",method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("user")  Admin user, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "admin";
		}
		return "success";		
	}
	
	@RequestMapping("/gameinfo")
	public String gameInfo() {
		
		return "gameinfo";
	}
	
	
	@RequestMapping("/registerSuccess")
	public String playersRegistrationSuccess() {
		
		return "successful";
	}
	
	}


