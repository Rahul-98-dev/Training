package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Players;
import com.app.entity.ScoreCard;
public interface ScoreRepository extends JpaRepository<ScoreCard,Integer>{
	
	
}
