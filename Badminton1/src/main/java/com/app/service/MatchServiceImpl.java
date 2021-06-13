package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.MatchEvent;
//import com.cg.springbootmvc.entity.Trainee;
//import com.cg.springbootmvc.exception.DuplicateTraineeException;
//import com.cg.springbootmvc.exception.TraineeNotFoundException;
//import com.cg.springbootmvc.repository.TraineeRepository;
import com.app.repository.MatchEventRepository;

@Service
public class MatchServiceImpl implements MatchService {
	
	@Autowired
	private MatchEventRepository matchRepository;

	@Override
	public MatchEvent saveMatchEvent(MatchEvent event) {
	
		Optional<MatchEvent> eventObj = matchRepository.findById(event.getMatchid());
//		
//        if (traineeObj.isPresent()) {
//            throw new DuplicateTraineeException(trainee);
//        }       
		
		return matchRepository.save(event);
			
	}

	
//	}

}
