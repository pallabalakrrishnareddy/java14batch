package com.springboot.kdomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_info")
public class Player {
	@Id
	@Column(name="player_id")
int playerId;
	@Column
	String playername;
	@Column
	String team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String playername, String team) {
		super();
		this.playerId = playerId;
		this.playername = playername;
		this.team = team;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playername=" + playername + ", team=" + team + "]";
	}
	
}
