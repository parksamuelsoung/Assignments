package com.forkgame.models;

/**
 * 
 */
public class Scene {
	
	private int sceneId;
	private String sceneSet;
	private String sceneTitle;
	private String sceneContent;
	private String sceneChoices;
	
	public Scene(int sceneId, String sceneSet, String sceneTitle, String sceneContent, String sceneChoices) {
		this.sceneId = sceneId;
		this.sceneSet = sceneSet;
		this.sceneTitle = sceneTitle;
		this.sceneContent = sceneContent;
		this.sceneChoices = sceneChoices;
	}
	
	public int getSceneId() {
		return sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public String getSceneSet() {
		return sceneSet;
	}

	public void setSceneSet(String sceneSet) {
		this.sceneSet = sceneSet;
	}

	public String getSceneTitle() {
		return sceneTitle;
	}

	public void setSceneTitle(String sceneTitle) {
		this.sceneTitle = sceneTitle;
	}

	public String getSceneContent() {
		return sceneContent;
	}

	public void setSceneContent(String sceneContent) {
		this.sceneContent = sceneContent;
	}

	public String getSceneChoices() {
		return sceneChoices;
	}

	public void setSceneChoices(String sceneChoices) {
		this.sceneChoices = sceneChoices;
	}

	@Override
	public String toString() {
		return String.format("%s%s%n%s%n", sceneTitle, sceneContent, sceneChoices);
	}
	
	
	
	

}
