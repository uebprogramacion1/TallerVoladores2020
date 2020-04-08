package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Liga_de_la_justicia;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View view;
	private Liga_de_la_justicia clases;
	
	
	
	
	public Controller() {
		view = new View();
		clases = new Liga_de_la_justicia();
		
		view.panel_ingreso.validar.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ex) {
		// TODO Auto-generated method stub
		if(ex.getActionCommand().equals("Validar"));
		
            view.panel_ingreso.descripcion_accion.setText("superman puede: "+clases.getSuperman().fly()+ "\n" + clases.getSuperman().eat()+ "\n" + clases.getSuperman().takeoff()+ "\n" + clases.getSuperman().land()+ "\n" + clases.getSuperman().leapBuilding()+ "\n" + clases.getSuperman().stopBullet()+ "\n" +clases.getSuperman().debilidad()+
            		"\n"+ "el pajaro puede:"+"\n"+clases.getBird().fly()+ "\n" + clases.getBird().eat()+ "\n" + clases.getBird().land()+ "\n" + clases.getBird().takeoff()+ "\n" + clases.getBird().buildNest()+ "\n" + clases.getBird().layEggs()+
            		"\n"+ "el seaplane puede: "+"\n"+clases.getSeaplane().fly()+ "\n"+ clases.getSeaplane().land()+ "\n"+ clases.getSeaplane().takeoff() + "\n" + clases.getSeaplane().acelerar()+
            		"\n"+"el helicoptero puede: "+"\n"+clases.getHelicopter().fly()+ "\n"+ clases.getHelicopter().land()+ "\n"+ clases.getHelicopter().takeoff()+ "\n"+ clases.getHelicopter().acelerar()); 		
			
			
			

	
	}
	
	
	
}
