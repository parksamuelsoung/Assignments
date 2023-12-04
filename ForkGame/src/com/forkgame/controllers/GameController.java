package com.forkgame.controllers;

import com.forkgame.models.Game;
import com.forkgame.services.GameService;

public class GameController {
	
	GameService gameService = new GameService();
	SceneController sceneController = new SceneController();
	
	public void start() {
		Game game = gameService.getGame();
		System.out.println(game);
		sceneController.getScene();
	}

}
