package com.ca.sportmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="match_data")
public class Matches {
	
  @Id
  //@Size(min=4,max=4,message="Enter W or L")
  @Column(name="match_id")
  public int matchId;
  
  @Column(name="PlayerId1")
  public int PlayerId1;
  
  @Column(name="PlayerId2")
  public int PlayerId2;
  
  @Column(name="PlayerId1Set1")
  public int PlayerId1Set1;
   @Column(name="PlayerId2Set1")
  public int PlayerId2Set1;
   
  @Column(name="PlayerId1Set2")
  public int PlayerId1Set2;
  @Column(name="PlayerId2Set2")
  public int PlayerId2Set2;
  
  @Column(name="PlayerId1Set3")
  public int PlayerId1Set3;
  @Column(name="PlayerId2Set3")
  public int PlayerId2Set3;
  
  //@Size(min=1,max=1,message="Enter W or L")
  @Column(name="matchResult")
  public int result;

public int getMatchId() {
	return matchId;
}

public void setMatchId(int matchId) {
	this.matchId = matchId;
}

public int getPlayerId1() {
	return PlayerId1;
}

public void setPlayerId1(int playerId1) {
	PlayerId1 = playerId1;
}

public int getPlayerId2() {
	return PlayerId2;
}

public void setPlayerId2(int playerId2) {
	PlayerId2 = playerId2;
}

public int getPlayerId1Set1() {
	return PlayerId1Set1;
}

public void setPlayerId1Set1(int playerId1Set1) {
	PlayerId1Set1 = playerId1Set1;
}

public int getPlayerId2Set1() {
	return PlayerId2Set1;
}

public void setPlayerId2Set1(int playerId2Set1) {
	PlayerId2Set1 = playerId2Set1;
}

public int getPlayerId1Set2() {
	return PlayerId1Set2;
}

public void setPlayerId1Set2(int playerId1Set2) {
	PlayerId1Set2 = playerId1Set2;
}

public int getPlayerId2Set2() {
	return PlayerId2Set2;
}

public void setPlayerId2Set2(int playerId2Set2) {
	PlayerId2Set2 = playerId2Set2;
}

public int getPlayerId1Set3() {
	return PlayerId1Set3;
}

public void setPlayerId1Set3(int playerId1Set3) {
	PlayerId1Set3 = playerId1Set3;
}

public int getPlayerId2Set3() {
	return PlayerId2Set3;
}

public void setPlayerId2Set3(int playerId2Set3) {
	PlayerId2Set3 = playerId2Set3;
}

public int getResult() {
	return result;
}

public void setResult(int result) {
	this.result = result;
}



  
}
