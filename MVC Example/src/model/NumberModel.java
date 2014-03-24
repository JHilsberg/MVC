package model;
import controller.*;

public class NumberModel {

	@SuppressWarnings("unused")
	private NumberController controller;
	
	private int number;
	
	public NumberModel(NumberController controller){
		this.controller = controller;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
