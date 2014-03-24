package view;

import java.awt.*;

import javax.swing.*;

import controller.*;

@SuppressWarnings("serial")
public class GUI extends JFrame {


	private JPanel panel = new JPanel();
	private JButton button = new JButton("Zahl ändern");
	private JLabel label = new JLabel();

	public GUI(NumberController controller) {
		//super("MVC Example");

		this.setSize(250, 100);
		panel.setLayout(new GridLayout(0, 2));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(button);
		button.addActionListener(controller);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
}
