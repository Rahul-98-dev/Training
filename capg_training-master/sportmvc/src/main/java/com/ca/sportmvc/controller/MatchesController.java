package com.ca.sportmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ca.sportmvc.entity.Matches;
import com.ca.sportmvc.service.MatchesService;

@Controller
public class MatchesController {
	
	@Autowired
	private MatchesService matchesService;
	
	@RequestMapping("/fixture")
	public String fixMatch() {
		return "fixture";
	}
	@RequestMapping(value="/saveFixtures", method = RequestMethod.POST)
	public String savefixMatch(@ModelAttribute Matches matches) {
		matchesService.fixture(matches);
		return "success";
	}
	@RequestMapping("/matchFixtures")
	public String newFixMatch() {
		return "fixture";
	}
	
	@RequestMapping("/seeFixtures")
	public String getAllTrainees(Model model) {
		List<Matches> matches = matchesService.fetchFixtures();
		model.addAttribute("matches", matches);		
		return "seeFixtures";
	}

}
