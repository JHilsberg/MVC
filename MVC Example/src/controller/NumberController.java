package controller;

import java.awt.event.*;
import java.util.*;

import javax.swing.JLabel;

import view.*;
import model.*;

public class NumberController implements ActionListener {

	private GUI gui;
	private NumberModel model;

	public NumberController() {
		this.gui = new GUI(this);
		this.model = new NumberModel(this);
	}

	private void createRandomNumber() {
		Random r = new Random();
		model.setNumber(r.nextInt(10));
	}

	public GUI getGui() {
		return gui;
	}

	public void setGui(GUI gui) {
		this.gui = gui;
	}

	public NumberModel getModel() {
		return model;
	}

	public void setModel(NumberModel model) {
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		createRandomNumber();
		gui.getLabel().setText("" + model.getNumber());
	}

}
