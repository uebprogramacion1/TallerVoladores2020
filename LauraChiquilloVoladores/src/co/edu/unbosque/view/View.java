package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	private JButton aeronaves;
	private JButton aves;
	private JButton Kriptoniano;
	public View(Controller control) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450,150);
		getContentPane().setLayout(null);
		
		aeronaves= new JButton("Aircraft");
		aeronaves.setBounds(40,50,100,30);
		aeronaves.addActionListener(control);
		add(aeronaves);
		
		aves= new JButton("Birds");
		aves.setBounds(160,50,100,30);
		aves.addActionListener(control);
		add(aves);
		
		Kriptoniano= new JButton("Kryptonian");
		Kriptoniano.setBounds(280,50,100,30);
		Kriptoniano.addActionListener(control);
		add(Kriptoniano);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
