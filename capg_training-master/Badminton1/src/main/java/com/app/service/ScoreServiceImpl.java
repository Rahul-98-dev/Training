package com.app.service;

import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;


import com.app.entity.ScoreCard;
import com.app.repository.ScoreRepository;

public class ScoreServiceImpl {
	
@Autowired
private ScoreRepository scoreRepository;

	public ScoreCard saveScore(ScoreCard scores) {
	
//		ScoreCard eventObj = scoreRepository.findById(scores.getMatchid()).get();
  
		
		return scoreRepository.save(scores);
}
}
