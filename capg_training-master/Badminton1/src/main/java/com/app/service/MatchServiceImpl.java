package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.MatchEvent;
import com.app.entity.ScoreCard;
//import com.cg.springbootmvc.entity.Trainee;
//import com.cg.springbootmvc.exception.DuplicateTraineeException;
//import com.cg.springbootmvc.exception.TraineeNotFoundException;
//import com.cg.springbootmvc.repository.TraineeRepository;
import com.app.repository.MatchEventRepository;
import com.app.repository.ScoreRepository;

@Service
public class MatchServiceImpl implements MatchService {
	
	@Autowired
	private MatchEventRepository matchRepository;

	@Autowired
	private ScoreRepository scoreRepository;
	
	@Override
	public MatchEvent saveMatchEvent(MatchEvent event) {
	
//		Optional<MatchEvent> eventObj = matchRepository.findById(event.getMatchid());
		
		ScoreCard sc = new ScoreCard();
		sc.setCurrentMatch(event);
		sc.setDate(event.getDate());
		sc.setPlayerid1(event.getPlayerid1());
		sc.setPlayerid2(event.getPlayerid2());
		
		scoreRepository.save(sc);
		
		return matchRepository.save(event);
			
	}

	
//	}

}
