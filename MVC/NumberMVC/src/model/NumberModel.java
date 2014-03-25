package model;

import java.util.Observable;

public class NumberModel extends Observable{
	
	private int number;

	public void setNumber(int number) {
		this.number = number;	
		this.setChanged();
		this.notifyObservers(this);
	}

	public String getNumberAsString() {
		return Integer.toString(number);
	}

}
