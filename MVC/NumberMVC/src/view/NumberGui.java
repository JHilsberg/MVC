package view;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import controller.NumberController;

public class NumberGui extends JFrame implements Observer{
	
	private JPanel mainPanel;
	private JButton numberButton;
	private JButton close;
	private JTextField numberField;
	
	
	public NumberGui(NumberController control){
		this.setTitle("MVC-Number-Example");
		this.setSize(300, 300);
		
		this.mainPanel = new JPanel(new BorderLayout());
		this.numberButton = new JButton("Zahl ‰ndern");
		this.close = new JButton("Schlieﬂen");
		this.numberField = new JTextField();
		
		this.mainPanel.add(this.numberButton, BorderLayout.EAST);
		this.mainPanel.add(this.close, BorderLayout.EAST);
		this.mainPanel.add(this.numberField, BorderLayout.CENTER);
		
		this.add(mainPanel);
			
		
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
