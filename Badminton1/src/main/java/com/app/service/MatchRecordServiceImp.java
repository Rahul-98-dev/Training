package com.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.MatchRecord;
import com.app.repository.MatchRecordRepository;
;

@Service
public class MatchRecordServiceImp implements MatchRecordService{

	@Autowired
	private MatchRecordRepository matchRecordRepository;
	

	@Override
	public MatchRecord saveMatchRecord(MatchRecord matchRecord) {
		return matchRecordRepository.save(matchRecord);
	}


	@Override
	public List<MatchRecord> fetchAllMatchRecord() {
		return matchRecordRepository.findAll();
	}

}
