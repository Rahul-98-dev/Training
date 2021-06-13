package com.app.service;

import java.util.List;


import com.app.entity.MatchRecord;


public interface MatchRecordService {
	
	public MatchRecord saveMatchRecord(MatchRecord matchRecord);

	public List<MatchRecord> fetchAllMatchRecord();

}
