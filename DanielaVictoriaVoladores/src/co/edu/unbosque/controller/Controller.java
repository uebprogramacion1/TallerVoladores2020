package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	public Mundo m;
	public View gui;

	public Controller () {
		m = new Mundo();
		gui = new View();
		
		gui.getVehicle().addActionListener(this);
		gui.getAirplane().addActionListener(this);
		gui.getSeaplane().addActionListener(this);
		gui.getHelicopter().addActionListener(this);
		gui.getBird().addActionListener(this);
		gui.getKryptonian().addActionListener(this);
		gui.getSuperman().addActionListener(this);
		gui.getExit().addActionListener(this);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Vehicle")) {
			gui.mostrarVehicle(m.getVeh().clasificar());
		}
		
		if (e.getActionCommand().equals("Airplane")) {
			gui.mostrarAirplane(m.getAir().takeoff()
					+m.getAir().land()+m.getAir().fly());
		}
		
		if (e.getActionCommand().equals("Seaplane")) {
			gui.mostrarSeaplane(m.getSea().describir());
		}
		
		if (e.getActionCommand().equals("Helicopter")) {
			gui.mostrarHelicoptero(m.getHel().Volar());
		}
		
		if (e.getActionCommand().equals("Bird")) {
			gui.mostrarBird(m.getBird().takeoff()
					+m.getBird().land()
					+m.getBird().fly()
					+m.getBird().buildNest()
					+m.getBird().layEggs()
					+m.getBird().eat());
		}
		
		if (e.getActionCommand().equals("Kryptonian")) {
			gui.mostrarKryptonian(m.getKry().crear());
		}
		
		if (e.getActionCommand().equals("Superman")) {
			gui.mostrarSuperman(m.getSman().takeoff()
					+m.getSman().land()
					+m.getSman().fly()
					+m.getSman().leapBuilding()
					+m.getSman().stopBullet()
					+m.getSman().eat());
		}
		
		if(e.getActionCommand().equals("exit")) {
			gui.setVisible(false);
		}
		
	}

}
