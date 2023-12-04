package com.forkgame.services;

import com.forkgame.daos.SceneDao;
import com.forkgame.models.Scene;

public class SceneService {
	
	private SceneDao sceneDao = new SceneDao();
	private String sceneSet;
	private int sceneSetNumber = 0;
	
	public Scene getScene(String sceneSetChoice) {
		sceneSet = sceneSetNumber + sceneSetChoice;
		Scene scene = sceneDao.getScene(sceneSet);
		sceneSetNumber++;
		return scene;
	}
	


}
