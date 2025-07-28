package day1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstJP extends JPanel implements ActionListener{
	private JLabel jl1;
	private JButton jbUp,jbDown ;
	
	private int counter = 0;
	
	public MyFirstJP() {
		setLayout(new GridLayout(3,1));//setLayOut Later
		
		//create instance of JLabel
		jl1 = new JLabel();
		jl1.setText("Hello");
		jl1.setFont(new Font(Font.SERIF, Font.ITALIC, 40));
		
		//create instance of JButton
		jbUp = new JButton("+");
		jbDown = new JButton("-");
		
		jbUp.setForeground(Color.GREEN);
		jbUp.setFont(new Font(Font.SERIF, Font.BOLD, 30));
				
		jbDown.setForeground(Color.RED);
		jbDown.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		//add Listeners to Buttons so that they can respond to click event
		
		jbUp.addActionListener(this);
		jbDown.addActionListener(this);
		
		add(jl1);// add JLabel to this Panel
		add(jbUp);// add JButton to this Panel
		add(jbDown); // add JButton to this Panel
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnClicked = (JButton)e.getSource();
		if (btnClicked.equals(jbUp)) {
			counter++;
			jl1.setText("Counter: "+counter);	
		}else if (btnClicked.equals(jbDown)) {
			counter--;
			jl1.setText("Counter: "+counter);	
		}else {
			jl1.setText("What was clicked? "+btnClicked.toString());
		}
		
		/*
		if (e.getActionCommand().equals("+")) {
			this.counter++;
			
		}else if (e.getActionCommand().equals("-")) {
			this.counter--;
		}*/
		
	}
	

}
