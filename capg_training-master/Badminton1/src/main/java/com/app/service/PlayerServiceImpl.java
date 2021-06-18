package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Players;
import com.app.repository.PlayerRepository;
@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
private PlayerRepository playersRepository;
	@Override
	public List<Players> getAllplayers() {
		
		return playersRepository.findAll();
	}
	
	
	@Override
	public Players savePlayer(Players players) {
		
	  return playersRepository.save(players);
	}
    
	@Override
	public List<Players> getMalePlayers() {
		List<Players> list = playersRepository.findByGender("male");
//		list.forEach(System.out::println);
//		System.out.println("Males: "+list);
		for (Players p: list) {
			System.out.println(p);
		}
		return list;

	}

	@Override
	public List<Players> getFemalePlayers() {
		List<Players> list = playersRepository.findByGender("female");
//		list.forEach(System.out::println);
//		System.out.println("Females: "+list);
		for (Players p: list) {
			System.out.println(p);
		}
		return list;
	}


}