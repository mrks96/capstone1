package de.openhpi.capstone1.game.controller;

import de.openhpi.capstone1.game.controller.IController
import de.openhpi.capstone1.game.model.Game;

public class GameController implements IController {

	Game game;
	
	public GameController(Game game) {
		this.game = game;
	}
	
	public void handleEvent() {
		game.updateGame();
	}
	
	@Override
	public void handleEvent() {
		game.updateGame();
	}
}
