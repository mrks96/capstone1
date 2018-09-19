package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.model.Game;
import processing.core.PApplet;

public class GameView extends Observer {


	public GameView(PApplet display, Game subject) {
		super(display, subject);
		update(0);
	}

	public void update(Object value) {

	}

}
