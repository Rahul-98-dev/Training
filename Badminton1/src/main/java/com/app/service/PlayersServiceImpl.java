package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Players;
import com.app.repository.PlayersRepository;

@Service
public class PlayersServiceImpl implements PlayersService {

	@Autowired
	private PlayersRepository playersRepository;
	
	@Override
	public Players savePlayer(Players players) {
		
		return playersRepository.save(players);
	}

	@Override
	public void deletePlayer(int playerId) {
		
		playersRepository.deleteById(playerId);
	}

	@Override
	public void modifyPlayer(Players players) {
		
		playersRepository.save(players);
		
	}

	@Override
	public Optional<Players> fetchPlayersById(int playerId) {
		
		return Optional.of(playersRepository.findById(playerId).get());
	}

	@Override
	public List<Players> fetchAllplayers() {
		
		return playersRepository.findAll();
	}

}
