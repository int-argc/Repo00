// GUI class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI extends JFrame {
	private JLabel lbl1;
	private JButton btn1;
	private boolean toggle;
	
	public GUI() {
		super();
		setLayout(new FlowLayout());
		
		toggle = false;
		lbl1 = new JLabel(">> I am label <<");
		add(lbl1);
		btn1 = new JButton("I am button");
		btn1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					toggleButton();
				}
			}
		);
		add(btn1);
	}
	
	public void toggleButton() {
		if(!toggle) {
			lbl1.setText("Who told you to click that button!!");
			lbl1.setForeground(Color.RED);
			toggle = true;
		}
		else {
			lbl1.setText(">> I am label <<");
			lbl1.setForeground(Color.BLACK);
			toggle = false;
		}
	}
	
}
