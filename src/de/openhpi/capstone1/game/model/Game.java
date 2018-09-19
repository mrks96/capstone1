package de.openhpi.capstone1.game.model;

import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

import de.openhpi.capstone1.game.model.ISubject;
import de.openhpi.capstone1.game.view.Observer;

public class Game implements ISubject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	private Point positionBall;
	private Point velocityBall;
	private Point positionPadle;
	private int lengthPadle;
	private int widthGame;
	private int heightGame;

	public Game(int lengthPadle, int widthGame, int heightGame){
		this.lengthPadle = lengthPadle;
		this.widthGame = widthGame;
		this.heightGame = heightGame;
	}
	
	public void updateGame() {
		//Some Code
		notifyAllObservers();
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);	
	}
	
	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(0); //TODO: Hier aendern!
		}
	}
	
	private void movePadleleft(){
		
	}
	
	private void movePadleright(){
		
	}
	
	private void additionalAction() {
		//Ball bounces against the left or right wall
		if ((positionBall.getX() <= 0)||(positionBall.getX() >= widthGame)){
			velocityBall.setLocation(-1*velocityBall.getX(),velocityBall.getY());
		}
		
		else if (positionBall.getX() >= widthGame) {
			
		}
			

	}	
	
}
