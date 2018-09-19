package de.openhpi.capstone1.game.model;

import de.openhpi.capstone1.game.view.Observer;

public interface ISubject {
	void attach(Observer observer);
	void notifyAllObservers();
}
