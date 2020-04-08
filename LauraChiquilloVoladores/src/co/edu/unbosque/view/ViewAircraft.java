package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.Seaplane;

public class ViewAircraft extends JFrame{

	private JButton  hidroavión;
	private JButton helicoptero;
	
	public ViewAircraft(Controller control) {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
		getContentPane().setLayout(null);
		
		hidroavión= new JButton("Seaplane");
		hidroavión.setBounds(40,25,100,30);
		hidroavión.addActionListener(control);
		add(hidroavión);
		
		helicoptero= new JButton("Helicopter");
		helicoptero.setBounds(160,25,100,30);
		helicoptero.addActionListener(control);
		add(helicoptero);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
