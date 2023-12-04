package com.forkgame.daos;

import java.util.ArrayList;

import com.forkgame.database.SceneTable;
import com.forkgame.models.Scene;

public class SceneDao {
	
	private SceneTable sceneTable = new SceneTable();
	
	public ArrayList<Scene> getScenes() {
		return sceneTable.getScenes();
	}
	
	public Scene getScene(String sceneSet) {
		for(Scene scene : getScenes()) {
			if(scene.getSceneSet().contains(sceneSet)) {
				return scene;
			}
		}
		System.out.println("Null scene of getScene in SceneDao.");
		return null;
	}
	

}
