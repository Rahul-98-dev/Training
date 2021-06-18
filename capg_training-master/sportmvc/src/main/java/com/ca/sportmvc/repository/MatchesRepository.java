package com.ca.sportmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ca.sportmvc.entity.Matches;

public interface MatchesRepository extends JpaRepository<Matches,Integer>{

}
