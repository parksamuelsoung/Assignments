package com.forkgame.database;

import java.util.ArrayList;
import java.util.Collections;

import com.forkgame.models.Player;

public class PlayerTable {
	
	private ArrayList<Player> players = new ArrayList<>();
	private int playerId;
	
	{
		Collections.addAll(players,
				new Player(playerId++, "Sam", 5, 5, 5, 5)
				);
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}

}
