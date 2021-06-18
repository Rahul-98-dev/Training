package com.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.MatchEvent;
import com.app.entity.ScoreCard;
import com.app.service.MatchService;
import com.app.service.ScoreService;




@Controller
@RequestMapping("/admin")
public class ScoreCardController{
	

	private ScoreService scoreService;
//	@RequestMapping("/scoreboard")
//	public String getRegForm() {
//		
//		return "scoreboard";
//	}
	
	@GetMapping("/ScoreBoard")
	public String addEventForm(Model model) {
		ScoreCard score = new ScoreCard();	
		model.addAttribute("score", score);
		return "scoreboard";
	}
		

	@RequestMapping(value="/update",method = RequestMethod.POST)
	public ModelAndView doRegister(@ModelAttribute ScoreCard score) {		
		ModelAndView mav = new ModelAndView("scoreboardsuccess", "score",score);		
		return mav;
			
}
}