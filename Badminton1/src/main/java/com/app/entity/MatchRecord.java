package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="match_records")
public class MatchRecord {
	
	@Id
	@Column(name="match_id")
	public int match_id;
	
    @Column(name="date")
	public String date;

	@Column(name="player_id1")
	public int player_id1;
    
	@Column(name="player_id2")
	public int player_id2;

	@Column(name="own_sets_p1")
	public int own_sets_p1;

	@Column(name="own_sets_p2")
	public int own_sets_p2;
	
	@Column(name="winner")
	public int winner;

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPlayer_id1() {
		return player_id1;
	}

	public void setPlayer_id1(int player_id1) {
		this.player_id1 = player_id1;
	}

	public int getPlayer_id2() {
		return player_id2;
	}

	public void setPlayer_id2(int player_id2) {
		this.player_id2 = player_id2;
	}

	public int getOwn_sets_p1() {
		return own_sets_p1;
	}

	public void setOwn_sets_p1(int own_sets_p1) {
		this.own_sets_p1 = own_sets_p1;
	}

	public int getOwn_sets_p2() {
		return own_sets_p2;
	}

	public void setOwn_sets_p2(int own_sets_p2) {
		this.own_sets_p2 = own_sets_p2;
	}

	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}

	
	
}
