package de.openhpi.capstone1.game.starter;


import de.openhpi.capstone1.game.controller.GameController;
import de.openhpi.capstone1.game.model.game;
import de.openhpi.capstone1.game.view.GameView;
import de.openhpi.capstone1.game.view.Observer;
import processing.core.PApplet;

public class TheApp extends PApplet {

	private Observer GameView;
	private GameController gameController;
	private Game game;
	private int widthGame;
	private int heightGame;
	private int lengthPadle;
	

	@Override
	public void settings() {
		widthGame = 200;
		heightGame = 200;
		lengthPadle = 50;
		size(widthGame, lengthGame);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		game = new Game(lengthPadle, widthGame, heightGame);
		gameController = new gameController(game);
		gameView = new GameView(this, game);
	}

	@Override
	public void draw() {
	}  // draw() loops forever, until stopped
	
	@Override
	public void mouseClicked() {
		GameController.handleEvent();
	}
}
