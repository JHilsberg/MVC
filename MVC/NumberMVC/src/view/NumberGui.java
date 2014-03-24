package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import model.NumberModel;
import controller.NumberController;

public class NumberGui extends JFrame implements Observer {
	
	private static final long serialVersionUID = -7153209324692738823L;
	
	private JPanel mainPanel;
	private JButton numberButton;
	private JButton close;
	private JTextField numberField;

	public NumberGui(NumberController control) {
		this.setTitle("MVC-Number-Example");
		this.setSize(450, 110);

		this.mainPanel = new JPanel(new BorderLayout());
		this.mainPanel.setLayout(new GridLayout(0, 3, 5, 5));
		this.mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.add(mainPanel);

		this.numberButton = new JButton("Change Number");
		this.numberButton.addActionListener(control);
		this.numberButton.setActionCommand("number");
		
		this.close = new JButton("Close");
		this.close.addActionListener(control);
		this.close.setActionCommand("close");
		
		this.numberField = new JTextField();

		this.mainPanel.add(this.numberButton);
		this.mainPanel.add(this.close);
		this.mainPanel.add(this.numberField);

	}

	@Override
	public void update(Observable arg0, Object mod){
		if(mod instanceof NumberModel){
			this.numberField.setText("Number: " + ((NumberModel) mod).getNumberString());
		}
	}
}
