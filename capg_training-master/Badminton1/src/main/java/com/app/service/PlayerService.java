package com.app.service;


	import java.util.List;
	

import com.app.entity.Players;



	public interface PlayerService {
		
	public Players savePlayer(Players players);

	List<Players> getAllplayers();
	List<Players> getMalePlayers();
	List<Players> getFemalePlayers();
	

	}


