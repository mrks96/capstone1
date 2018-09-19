package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.model.ISubject;
import processing.core.PApplet;

public abstract class Observer {
	protected PApplet display;	
	
	public Observer(PApplet display, ISubject subject) {
		this.display = display;
		subject.attach(this);
	}
	
	public abstract void update(Object value);
}
