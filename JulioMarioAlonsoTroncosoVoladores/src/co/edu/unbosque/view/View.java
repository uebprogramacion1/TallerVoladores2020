package co.edu.unbosque.view;

import java.awt.Color;


import javax.swing.JFrame;


import co.edu.unbosque.model.Animal;
import co.edu.unbosque.model.Flyer;

public class View extends JFrame implements Flyer {
	
	public Panel_ingreso panel_ingreso;
	
	
	public View() {
		
		getContentPane().setLayout(null);
		setSize(500, 500);
		setTitle("");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.cyan);
		
		
		panel_ingreso = new Panel_ingreso();
		panel_ingreso.setBounds(25, 25, 450, 520);
		getContentPane().add(panel_ingreso);
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void inicializarComponentes() {
		 
	    panel_ingreso = new Panel_ingreso();
		panel_ingreso.setBounds(25, 25, 535, 350);
		getContentPane().add(panel_ingreso);
		
		
	}
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String land() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return null;
	}


	


	
	
}
