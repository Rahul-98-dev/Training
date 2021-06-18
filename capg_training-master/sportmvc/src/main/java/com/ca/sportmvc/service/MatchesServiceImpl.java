package com.ca.sportmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ca.sportmvc.entity.Matches;
import com.ca.sportmvc.repository.MatchesRepository;
@Service
public class MatchesServiceImpl implements MatchesService {

	@Autowired
	private MatchesRepository matchesRepository;
	@Override
	public Matches fixture(Matches matches) {
		return matchesRepository.save(matches);
	}

	@Override
	public List<Matches> fetchFixtures() {
		return matchesRepository.findAll();
	}

	@Override
	public Optional<Matches> fetchMatch(int matchId) {
		return matchesRepository.findById(matchId);
	}

}
