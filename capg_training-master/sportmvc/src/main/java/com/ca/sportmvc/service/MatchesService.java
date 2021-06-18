package com.ca.sportmvc.service;

import java.util.List;
import java.util.Optional;

import com.ca.sportmvc.entity.Matches;

public interface MatchesService {
	
	public Matches fixture(Matches matches);
	
	public List<Matches> fetchFixtures();
	
	public Optional<Matches> fetchMatch(int matchId);

}
