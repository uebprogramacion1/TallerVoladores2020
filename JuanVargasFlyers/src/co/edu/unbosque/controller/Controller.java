package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	public View gui;
	public Mundo mundo;

	public Controller () {
		mundo = new Mundo();
		gui = new View();
		

		gui.getAeroplano().addActionListener(this);
		gui.getVehiculo().addActionListener(this);
		gui.getHidroavion().addActionListener(this);
		gui.getHelicoptero().addActionListener(this);
		gui.getKryptoniano().addActionListener(this);
		gui.getSuperman().addActionListener(this);
		gui.getSalidat().addActionListener(this);
		gui.getPajaro().addActionListener(this);
	}

	public void actionPerformed(ActionEvent escucha) {
		
		if (escucha.getActionCommand().equals("Vehiculo")) {
			gui.mostrarVehicle(mundo.getVeh().clasificar());
		}
		
		if (escucha.getActionCommand().equals("Aeroplano")) {
			gui.mostrarAirplane(mundo.getAir().despegar()
					+mundo.getAir().aterrizar()+mundo.getAir().volar());
		}
		
		if (escucha.getActionCommand().equals("Hidroavion")) {
			gui.mostrarSeaplane(mundo.getSea().describir());
		}
		
		if (escucha.getActionCommand().equals("Helicoptero")) {
			gui.mostrarHelicoptero(mundo.getHel().Volar());
		}
		
		if (escucha.getActionCommand().equals("Pajaro")) {
			gui.mostrarBird(mundo.getBird().despegar()
					+mundo.getBird().aterrizar()
					+mundo.getBird().volar()
					+mundo.getBird().construir()
					+mundo.getBird().poner()
					+mundo.getBird().alimentar());
		}
		
		if (escucha.getActionCommand().equals("Kryptonian")) {
			gui.mostrarKryptonian(mundo.getKry().crear());
		}
		
		if (escucha.getActionCommand().equals("Superman")) {
			gui.mostrarSuperman(mundo.getSman().despegar()
					+mundo.getSman().aterrizar()
					+mundo.getSman().volar()
					+mundo.getSman().leapBuilding()
					+mundo.getSman().stopBullet()
					+mundo.getSman().alimentar());
		}
		
		if(escucha.getActionCommand().equals("Salir")) {
			gui.setVisible(false);
		}
		
	}

}
