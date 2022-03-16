package com.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="player_tab")
public class Player {
	public Player() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="player_id")
	int playerId;
	@Column
	String playerName;
	@Column
	String team;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Player(int playerId, String playerName, String team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.team = team;
	}



}