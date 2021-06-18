package com.app.controller;



	import java.util.List;

import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import com.app.bean.*;
	import com.app.entity.Players;
	import com.app.service.PlayerService;

	@Controller
	@RequestMapping("/admin")
	public class PlayerController {
		
		@Autowired
		private PlayerService playersService;
		
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
		@RequestMapping("/getallplayers")
		public String getAllPlayers(Model model) {
			List<Players> players = playersService.getAllplayers();
			model.addAttribute("players", players);		
			return "allplayers";
		
		}
		@RequestMapping("/getMalePlayers")
		public String getMPlayers(Model model) {
			List<Players> malePlayers = playersService.getMalePlayers();
			model.addAttribute("male_players", malePlayers);		
			return "maleplayers";
		
		}
		@RequestMapping("/getFemalePlayers")
		public String getFPlayers(Model model) {
			List<Players> malePlayers = playersService.getFemalePlayers();
			model.addAttribute("female_players", malePlayers);		
			return "femaleplayers";
		
		}
	}
