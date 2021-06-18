package com.ca.sportmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ca.sportmvc.entity.Players;

public interface PlayersRepository extends JpaRepository<Players,Integer> {

}
