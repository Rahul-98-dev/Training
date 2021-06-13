package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Players;
import com.app.service.PlayersService;

@Controller

public class PlayersController {
	
	@Autowired
	private PlayersService playersService;
	
	@RequestMapping("/register")
	public String playersRegistration() {
		return "register";
	}
	@RequestMapping(value="/savePlayer",method = RequestMethod.POST)
	public String playerRegistered(@ModelAttribute Players players) {
		playersService.savePlayer(players);
		return "registrationSuccessful";
	}
	
	@RequestMapping("/registerSuccess")
	public String playersRegistrationSuccess() {
		
		return "successful";
	}
	
	@RequestMapping("/getallplayers")
	public String getAllPlayers(Model model,Players gender) {
		List<Players> players = playersService.fetchAllplayers();
		model.addAttribute("players", players);		
		return "allplayers";
	
	}

}


