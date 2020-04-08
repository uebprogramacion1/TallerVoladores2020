package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.SalonJusticia;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private SalonJusticia mundo;
	private View gui;

	public Controller() {
		mundo = new SalonJusticia();
		gui = new View();
		gui.setVisible(true);
		gui.getPanelInteraccion().getBtonHidroavion().addActionListener(this);
		gui.getPanelInteraccion().getBtonHelicoptero().addActionListener(this);
		gui.getPanelInteraccion().getBtonPajaro().addActionListener(this);
		gui.getPanelInteraccion().getBtonSuperman().addActionListener(this);
		gui.getPanelInteraccion().getBtonEliminar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getActionCommand().equals("Hidroavión")) {
			gui.getPanelMostrar().getTxtLetraCancion().setText(null);
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHidroAvion().vehicleType() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHidroAvion().takeOff() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHidroAvion().land() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHidroAvion().fly() + "\n\n");
		}
		if (evento.getActionCommand().equals("Helicóptero")) {
			gui.getPanelMostrar().getTxtLetraCancion().setText(null);
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHelicoptero().vehicleType() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHelicoptero().takeOff() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHelicoptero().land() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getHelicoptero().fly() + "\n\n");
		}
		if (evento.getActionCommand().equals("Pájaro")) {
			gui.getPanelMostrar().getTxtLetraCancion().setText(null);
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().classType() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().takeOff() + " ");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().land());
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().fly() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().buildNest() + " ");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().layEggs() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getPajaro().eat() + "\n\n");
		}
		if (evento.getActionCommand().equals("Superman")) {
			gui.getPanelMostrar().getTxtLetraCancion().setText(null);
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().classType() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().takeOff() + "\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().land() + " ");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().fly() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().leapBuilding() + " ");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().stopBullet() + "\n\n");
			gui.getPanelMostrar().getTxtLetraCancion().append(mundo.getSuperman().eat() + "\n\n");
		}
		if (evento.getActionCommand().equals("LimpiarT")) {
			gui.getPanelMostrar().getTxtLetraCancion().setText(null);
		}
	}
}
