package com.mtmm.entities;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class Game implements Serializable {
	protected int gameNo;
	protected String seriesName;
	protected String location;
	protected String description;
	protected Map<Integer, Player> players;

	public int getGameNo() {
		return gameNo;
	}

	public void setGameNo(int gameNo) {
		this.gameNo = gameNo;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Integer, Player> getPlayers() {
		return players;
	}

	public void setPlayers(Map<Integer, Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Game [gameNo=" + gameNo + ", seriesName=" + seriesName + ", location=" + location + ", description="
				+ description + ", players=" + players + "]";
	}
}
