package day1;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstJFrame  extends JFrame{
	
	public MyFirstJFrame() {
		JPanel mainJP = new JPanel();
		mainJP.setBackground(Color.red);
		mainJP.setLayout(new GridLayout(1, 2));
		
		MyFirstJP jp1 = new MyFirstJP();
		jp1.setBackground(Color.yellow);
		MyFirstJP jp2 = new MyFirstJP();
		jp2.setBackground(Color.GREEN);
		
		
		mainJP.add(jp1);//add Jp1 to main JPanel
		mainJP.add(jp2);// add jp2 ri Main JPabel
		add(mainJP); // add mainJP to JFrame
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Must set default close to prevent resource Leak
		
		//optional set title
		
		pack();//pack smallest size needed to fit all components
		
		setVisible(true);
		//int i =0[]
	}

}
