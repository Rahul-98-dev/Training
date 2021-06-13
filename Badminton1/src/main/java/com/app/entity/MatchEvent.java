package com.app.entity;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Matches")
public class MatchEvent {



@Column(name="Date")
@DateTimeFormat(pattern = "MM/dd/yyyy")
private String date;
@Id
@Column(name="match_id", length = 30)
private int matchid;
@Column(name="player_id", length = 30)
private int playerid;
public MatchEvent(String date, int matchid, int playerid) {
	super();
	this.date = date;
	this.matchid = matchid;
	this.playerid = playerid;
}
public MatchEvent(String date) {
	this.date = date;
}
public MatchEvent() {

}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getMatchid() {
	return matchid;
}
public void setMatchid(int matchid) {
	this.matchid = matchid;
}
public int getPlayerid() {
	return playerid;
}
public void setPlayerid(int playerid) {
	this.playerid = playerid;
}
}
