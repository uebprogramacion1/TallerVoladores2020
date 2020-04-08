package co.edu.unbosque.view;

import java.io.InputStream;

import javax.swing.JOptionPane;

public class Dialogos {
	public String input(InputStream systemIn, String title, String message, int messageType) {
		return JOptionPane.showInputDialog(null, message, title, messageType);
	}
	public void output(String title, String message, int messageType) {
		JOptionPane.showMessageDialog(null, message, title, messageType);
	}
	public String menu() {
		return "0. Salir\n"
				+ "1. Escoger Categorias\n";
	}
	
	public String menu1() {
		return "0. Salir\n" + "1. SeaPlane \n"
	    + "2. Bird\n"+"3. Helicoptero\n"+"4. Superman\n";		
	}

}
