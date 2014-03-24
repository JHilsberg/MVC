package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import model.NumberModel;
import view.NumberGui;

public class NumberController implements ActionListener {

	private NumberGui view;
	private NumberModel model;

	public NumberController() {

		this.model = new NumberModel();
		this.view = new NumberGui(this);
		
		this.model.addObserver(this.view);
		
		this.view.setVisible(true);
	}

	private void changeNumber() {
		Random r = new Random();
		model.setNumber(r.nextInt(10) + 1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equalsIgnoreCase("number")) {
			changeNumber();
		} else {
			this.view.setVisible(false);
		}
	}
}
