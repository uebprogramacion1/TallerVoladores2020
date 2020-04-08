package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Salon_de_Justicia;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View v;
	private Salon_de_Justicia j;
	
	public Controller(){
		v = new View();
		j = new Salon_de_Justicia();
		v.getB().getAvion().addActionListener(this);
		v.getB().getHelicoptero().addActionListener(this);
		v.getB().getPajaro().addActionListener(this);
		v.getB().getSuperman().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

if(e.getActionCommand().equals("avion")){
	
	v.getB().setVisible(false);
	v.getP().setVisible(true);
	v.mostrarMensajeSalida(j.getSeaPlane().takeOFF()+"\n"+j.getSeaPlane().fly()+"\n"+j.getSeaPlane().land()+"\n"+j.getSeaPlane().gasolina());
	v.getP().getSalida().addActionListener(this);
	
}else if(e.getActionCommand().equals("helicoptero")){
	
	v.getB().setVisible(false);
	v.getP().setVisible(true);
	v.mostrarMensajeSalida(j.getHelicopter().takeOFF()+"\n"+j.getHelicopter().fly()+"\n"+j.getHelicopter().land()+"\n"+j.getHelicopter().gasolina());
	v.getP().getSalida().addActionListener(this);
	
}else if(e.getActionCommand().equals("pajaro")){
	
	v.getB().setVisible(false);
	v.getP().setVisible(true);
	v.mostrarMensajeSalida(j.getBird().takeOFF()+"\n"+j.getBird().fly()+"\n"+j.getBird().land()+"\n"+j.getBird().eat()+"\n"+j.getBird().buildNest()+"\n"+j.getBird().layEggs());
	v.getP().getSalida().addActionListener(this);
	
}else if(e.getActionCommand().equals("superman")){
	
	v.getB().setVisible(false);
	v.getP().setVisible(true);
	v.mostrarMensajeSalida(j.getSuperman().takeOFF()+"\n"+j.getSuperman().fly()+"\n"+j.getSuperman().land()+"\n"+j.getSuperman().eat()+"\n"+j.getSuperman().planeta()+"\n"+j.getSuperman().leapBuilding()+"\n"+j.getSuperman().stopBullet());
	v.getP().getSalida().addActionListener(this); 
	}else if(e.getActionCommand().equals("salir")){
		v.getB().setVisible(true);
		v.getP().setVisible(false);
	}
		
	}

}
