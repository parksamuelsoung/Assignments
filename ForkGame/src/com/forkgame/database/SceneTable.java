package com.forkgame.database;

import java.util.ArrayList;
import java.util.Collections;

import com.forkgame.models.Scene;

public class SceneTable {
	
	private ArrayList<Scene> scenes = new ArrayList<>();
	private int sceneId;
	
	{
		Collections.addAll(scenes,
				new Scene(sceneId++,
						"0a",
						"Start Game\n",
						"Mission Impeccable\n",
						"a) start now"),
				new Scene(sceneId++,
						"1a",
						"Spaghetti Leftovers\n",
						"You were left in a bowl of spagetti leftovers.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the spaghetti\n" +
						"b) keep it on, nice hairdo"),
				new Scene(sceneId++,
						"2a",
						"Shook It Off\n",
						"You are still on top of the dining table.\n" +
						"You need to get down and start your mission.\n",
						"a) use the chair to lower yourself\n" +
						"b) jump directly onto the floor"),
				new Scene(sceneId++,
						"2b",
						"Nice Hairdo\n",
						"You are still on top of the dining table.\n" +
						"You need to get down and start your mission.\n",
						"a) use the chair to lower yourself\n" +
						"b) jump directly onto the floor")
				);
	}
	
	public ArrayList<Scene> getScenes() {
		return scenes;
	}
	

}
