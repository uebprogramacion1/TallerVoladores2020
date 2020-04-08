package co.edu.unbosque.controller;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller {
	private Mundo m;
	private View v;
	public Controller() {
		m = new Mundo();
		v = new View();
		v.name(m.getHel().takeOff());
	}

}
