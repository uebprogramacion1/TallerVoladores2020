package co.edu.unbosque.controller;

import co.edu.unbosque.model.SalonDeLaJusticia;
import co.edu.unbosque.view.View;

public class Controller {

	private SalonDeLaJusticia salonDeLaJusticia;
	private View gui;

	public Controller() {
		salonDeLaJusticia = new SalonDeLaJusticia();
		gui = new View();
		mostrarDatos();
	}

	private void mostrarDatos() {
		
		gui.asignarValoresBird(salonDeLaJusticia.getBird().eat(), salonDeLaJusticia.getBird().toString(), salonDeLaJusticia.getBird().fly());
		gui.asignarValoresHelicopter(salonDeLaJusticia.getHelicopter().tanquear(), salonDeLaJusticia.getHelicopter().toString(), salonDeLaJusticia.getHelicopter().takeOff());
		gui.asignarValoresSeaPlane(salonDeLaJusticia.getSeaPlane().fly(), salonDeLaJusticia.getSeaPlane().toString(), salonDeLaJusticia.getSeaPlane().takeOff());
		gui.asignarValoresSuperman(salonDeLaJusticia.getSuperman().eat(), salonDeLaJusticia.getSuperman().toString(), salonDeLaJusticia.getSuperman().defender());
	}

}
