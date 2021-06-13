package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.MatchRecord;

import com.app.service.MatchRecordService;

@Controller
public class MatchRecordController {

	@Autowired
	MatchRecordService matchRecordService;
	
	@RequestMapping("matchPlay")
	public String matchPlayground() {
		return "matchplay";
	}
	@RequestMapping(value="/saveMatchRecord",method = RequestMethod.POST)
	public String matchRecordSave(@ModelAttribute MatchRecord matchRecord) {
		matchRecordService.saveMatchRecord(matchRecord);
		return "matchplaysaved";
	}
	
	@RequestMapping("/getAllMatchRecords")
	public String showAllMatchRecords(Model model) {
		List<MatchRecord> matchRecords = matchRecordService.fetchAllMatchRecord();
		model.addAttribute("matchRecords", matchRecords);	
		return "matchRecordList";
	}
	
}
