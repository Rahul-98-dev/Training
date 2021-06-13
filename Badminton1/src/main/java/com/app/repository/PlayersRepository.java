package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Players;

public interface PlayersRepository extends JpaRepository<Players,Integer> {

}
