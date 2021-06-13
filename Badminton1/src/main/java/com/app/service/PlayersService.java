package com.app.service;

import java.util.List;
import java.util.Optional;
import com.app.entity.Players;

public interface PlayersService {
	
	public Players savePlayer(Players players);
	
	public void deletePlayer(int playerId);
	
	public void modifyPlayer(Players players);
	
	public Optional<Players> fetchPlayersById(int playerId);
	
	public List<Players> fetchAllplayers();

}
