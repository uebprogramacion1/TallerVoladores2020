package co.edu.unbosque.controller;

import co.edu.unbosque.model.mundo;
import co.edu.unbosque.view.Interfaz;

public class Controlador {
	
	private mundo m;
	private Interfaz gui;
	
	public Controlador() {
		m= new mundo();
		
		gui=new Interfaz();
		
		gui.cadena(m.getSu().stopBullet());
	}

}
