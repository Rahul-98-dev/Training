package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.MatchRecord;


public interface MatchRecordRepository extends JpaRepository<MatchRecord,Integer> {

}
