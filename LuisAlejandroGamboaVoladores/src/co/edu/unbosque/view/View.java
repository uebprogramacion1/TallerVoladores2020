package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

import co.edu.unbosque.model.Animal;
import co.edu.unbosque.model.Flyer;

public class View extends JFrame  {
	
	public Panel_ingreso panel_ingreso;
	
	
	public View() {
		
		getContentPane().setLayout(null);
		setTitle("Interfaz");
		setBounds(0, 0, 500, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		
		
		panel_ingreso = new Panel_ingreso();
		panel_ingreso.setBounds(25, 25, 450, 520);
		getContentPane().add(panel_ingreso);
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}


	


	
	
}
