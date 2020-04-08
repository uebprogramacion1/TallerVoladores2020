package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;


public class View extends JFrame {
 
public Panel panel ;
	
	public View() {
		
		getContentPane().setLayout(null);
		setSize(600, 400);
		setTitle("Interfaz");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
			
		inicializarComponentes();
			
			
		setLocationRelativeTo(null);
		setVisible(true);
		
			
		}

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		panel= new Panel();
		
		panel.setBounds(5,5,550,350);
		getContentPane().add(panel);
	}
}
