package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private Mundo mundo;
	private View gui;
	
	
	public Controller() {
		mundo = new Mundo();
		gui = new View();
		
		gui.getPanel().getBotonMostrar().addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(gui.getPanel().getBotonMostrar())) {
			String superman = "";
			String ave = "";
			String helicoptero = "";
			String hidroavion = "";
			superman = mundo.getSuperman().eat() + "\n" + mundo.getSuperman().fly() + "\n" + mundo.getSuperman().land() + "\n" + mundo.getSuperman().leapBuilding() + "\n" + mundo.getSuperman().stopBullet() + "\n" + mundo.getSuperman().takeOff();
			gui.getPanel().getCampoSuperman().setText(superman);
			
		}
		
		
	}

}
