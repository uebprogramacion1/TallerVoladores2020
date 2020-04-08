package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.InterfazGui;

public class Controller implements ActionListener{
	
	InterfazGui gui;
	Mundo m;
	public Controller() {
		

		
		gui = new InterfazGui();
		gui.setVisible(true);
		gui.getAirplane().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
	
		if (evento.getActionCommand().equals("Airplane")) {
			JOptionPane.showMessageDialog(null, "El avion esta despegando de la ciudad de Bogota");
			
					}
		
		
	}

}
