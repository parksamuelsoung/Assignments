package com.forkgame.models;

public class Player {
	
	private int playerId;
	private String playerName;
	private int playerRank;
	private int overallRating;
	private int cleanlinessRating;
	private int moraleRating;
	
	public Player(int playerId, String playerName, int playerRank,
			int overallRating, int cleanlinessRating, int moraleRating) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerRank = playerRank;
		this.overallRating = overallRating;
		this.cleanlinessRating = cleanlinessRating;
		this.moraleRating = moraleRating;
	}

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
	
	public int getPlayerRank() {
		return playerRank;
	}
	
	public void setPlayerRank(int playerRank) {
		this.playerRank = playerRank;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public int getCleanlinessRating() {
		return cleanlinessRating;
	}

	public void setCleanlinessRating(int cleanlinessRating) {
		this.cleanlinessRating = cleanlinessRating;
	}

	public int getMoraleRating() {
		return moraleRating;
	}

	public void setMoraleRating(int moraleRating) {
		this.moraleRating = moraleRating;
	}

	@Override
	public String toString() {
		return String.format("Review: %s %s/5 %s/5"
				, playerName, cleanlinessRating, moraleRating);
	}
	
	

}
