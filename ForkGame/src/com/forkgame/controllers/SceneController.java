package com.forkgame.controllers;

import java.util.Scanner;

import com.forkgame.models.Scene;
import com.forkgame.services.SceneService;

public class SceneController {
	
	private SceneService sceneService = new SceneService();
	private Scanner scanner = new Scanner(System.in);
	
	public void getScene() {
		Scene startScene = sceneService.getScene("a");
		System.out.println(startScene);
		
		System.out.print(">");
		String sceneSetChoice = scanner.nextLine();
		
		Scene scene = sceneService.getScene(sceneSetChoice);
		System.out.println(scene);
	}

}
