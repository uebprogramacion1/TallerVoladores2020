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
		view.panel_ingreso.boton1.addActionListener(this);
		view.panel_ingreso.boton2.addActionListener(this);
		view.panel_ingreso.boton3.addActionListener(this);
		view.panel_ingreso.boton4.addActionListener(this);
		view.panel_ingreso.boton5.addActionListener(this);
		view.panel_ingreso.boton6.addActionListener(this);
		
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent ex) {
		// TODO Auto-generated method stub
		if(ex.getActionCommand().equals("pajaro"));
		
     view.panel_ingreso.area.setText(clases.getBird().buildNest());
		
	
     
	if (ex.getActionCommand().equals("Airplane")) ;
		
	 view.panel_ingreso.area.setText(clases.getAir().capacidadAvion());
	 
	 if (ex.getActionCommand().equals("Kriptonian")) ;
		
	 view.panel_ingreso.area.setText(clases.getKrip().stopBullet());
	
	 
	 if (ex.getActionCommand().equals("SeaPlane")) ;
		
	 view.panel_ingreso.area.setText(clases.getSeaplane().capacidadSeaPlane()); 
	 
	 if (ex.getActionCommand().equals("Helicopter")) ;
		
	 view.panel_ingreso.area.setText(clases.getHeli().capacidadHelicopter()); 
	
	 if (ex.getActionCommand().equals("Vehicle")) ;
		
	 view.panel_ingreso.area.setText(clases.getVehi().combustible()); 
	


	}
}
