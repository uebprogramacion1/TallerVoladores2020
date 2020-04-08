package co.edu.unbosque.controller;

import co.edu.unbosque.model.SalonDeLaJusticia;
import co.edu.unbosque.view.View;

public class Controller {
	SalonDeLaJusticia salonDeLaJusticia;
	
	View view;
	public Controller() {
		// TODO Auto-generated constructor stub
		view = new View();
		salonDeLaJusticia = new SalonDeLaJusticia();
		
		view.panel.setTakeoffseaplane(salonDeLaJusticia.getSeaplane().takeOff());
		view.panel.setflyseaplane(salonDeLaJusticia.getSeaplane().fly());
		view.panel.setlandseaplane(salonDeLaJusticia.getSeaplane().land());
	
		view.panel.setTakeoffHelicopter(salonDeLaJusticia.getHelicopter().takeOff());
		view.panel.setflyHelicopter(salonDeLaJusticia.getHelicopter().fly());
		view.panel.setlandHelicopter(salonDeLaJusticia.getHelicopter().land());
		
		view.panel.setTakeoffBird(salonDeLaJusticia.getBird().takeOff());
		view.panel.setFlyAirpBird(salonDeLaJusticia.getBird().fly());
		view.panel.setLandAirBird(salonDeLaJusticia.getBird().land());
		
		view.panel.setTakeoffSuperman(salonDeLaJusticia.getSuperman().takeOff());
		view.panel.setFlyAirpSuperman(salonDeLaJusticia.getSuperman().fly());
		view.panel.setLandAirSuperman(salonDeLaJusticia.getSuperman().land());
		
	} 
	
}
