package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewMostrar extends JFrame{

	private JTextArea mostrar_datos;
	
	public ViewMostrar() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(260,200);
		getContentPane().setLayout(null);
		
		mostrar_datos= new JTextArea();
		mostrar_datos.setBounds(1,5,250,170);
		add(mostrar_datos);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

	public JTextArea getMostrar_datos() {
		return mostrar_datos;
	}

	public void setMostrar_datos(JTextArea mostrar_datos) {
		this.mostrar_datos = mostrar_datos;
	}
	
}
