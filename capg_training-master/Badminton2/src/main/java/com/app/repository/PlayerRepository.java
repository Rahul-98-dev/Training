package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.Players;
@Repository
public interface PlayerRepository extends JpaRepository<Players,Integer>{

	

//	@Query("select u from Players u where u.gender=:rl")
//	public List<Players> findByGender(@Param("rl") Players gender);

	
	List<Players> findByGender(String gender);
	
	
}
